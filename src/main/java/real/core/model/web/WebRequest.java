package real.core.model.web;

import java.util.Map;
import java.util.Objects;

/**
 * Model a web request for dialog with external
 * third party server. This abstraction is like a 
 * HttpServletRequest but mor simple.
 * Methods for became http request can be grouped
 * for simplify construction over session.
 * @author rmunozdev
 *
 */
public class WebRequest {

	private String id;
	private String url;
	private Map<String, String> headers;
	private String method;
	private Map<String, String> parameters;
	
	public WebRequest() {
		this.id = "WREQ_" 
				+ Thread.currentThread().getName() 
				+ System.currentTimeMillis();
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Map<String, String> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Map<String, String> getParameters() {
		return parameters;
	}
	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
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
		if(obj instanceof WebRequest) {
			WebRequest casted = (WebRequest) obj;
			return this.id.equals(casted.id);
		}
		return false;
	}
	
	@Override
	public String toString() {
		Object[] args = {
				this.id,
				this.method,
				this.url
				};
		return String.format("WebRequest %s(%s, url:%s)", args);
	}
	
}
