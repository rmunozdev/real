package real.core.model.web;

import java.util.Map;
import java.util.Objects;

/**
 * Provides operation for secure request.
 * Could storage security keys, so this will produce
 * some vulnerabilities. For that it could be necesary
 * to build a better storage system.
 * @author rmunoz
 *
 */
public class WebSecurity {

	private String id;
	private String baseUrl;
	private String sslCertificate;
	private String cookie;
	private Map<String,String> tokens;
	
	public WebSecurity() {
		this.id = "WSEC_" 
				+ Thread.currentThread().getName() 
				+ System.currentTimeMillis();
	}
	
	public String getSslCertificate() {
		return sslCertificate;
	}
	public void setSslCertificate(String sslCertificate) {
		this.sslCertificate = sslCertificate;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public Map<String, String> getTokens() {
		return tokens;
	}
	public void setTokens(Map<String, String> tokens) {
		this.tokens = tokens;
	}
	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	public String getId() {
		return id;
	}
	
	@Override
	public int hashCode() {
		Objects.requireNonNull(this.id);
		return this.id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Objects.requireNonNull(this.id);
		if(obj instanceof WebSecurity) {
			WebSecurity casted = (WebSecurity) obj;
			return this.id.equals(casted.id);
		}
		return false;
	}
	
	@Override
	public String toString() {
		Object[] args = {
				this.id,
				this.baseUrl
				};
		return String.format("Session %s(%s)", args);
	}
	
}
