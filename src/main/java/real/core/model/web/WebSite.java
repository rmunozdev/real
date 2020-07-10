package real.core.model.web;

import java.util.Map;
import java.util.Objects;

/**
 * Model a basic web site, with all links ready to
 * begin some kind of path for resolve session issues.
 * @author rmunozdev
 *
 */
public class WebSite {

	private String id;
	private String baseUrl;
	private String rootUrl;
	private Map<String,String> formsUrls;
	private Map<String,String> resourceUrls;
	
	public WebSite() {
		this.id = "WSITE_" 
				+ Thread.currentThread().getName() 
				+ System.currentTimeMillis();
	}
	
	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	public String getRootUrl() {
		return rootUrl;
	}
	public void setRootUrl(String rootUrl) {
		this.rootUrl = rootUrl;
	}
	public Map<String, String> getFormsUrls() {
		return formsUrls;
	}
	public void setFormsUrls(Map<String, String> formsUrls) {
		this.formsUrls = formsUrls;
	}
	public Map<String, String> getResourceUrls() {
		return resourceUrls;
	}
	public void setResourceUrls(Map<String, String> resourceUrls) {
		this.resourceUrls = resourceUrls;
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
		if(obj instanceof WebSite) {
			WebSite casted = (WebSite) obj;
			return this.id.equals(casted.id);
		}
		return false;
	}
	
	@Override
	public String toString() {
		Object[] args = {
				this.id,
				this.baseUrl,
				this.rootUrl
				};
		return String.format("WebSite %s(b: %s, r:%s)", args);
	}
}
