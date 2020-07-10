package real.core.model.web;

import java.util.Map;
import java.util.Objects;

/**
 * Models session that persist content between request.
 * It provides operations for store and retrieve content.
 * @author rmunoz
 *
 */
public class WebSession {

	public String id;
	public Map<String,String> parameters;
	public String expiration;
	
	public WebSession() {
		this.id = "WSESS_" 
				+ Thread.currentThread().getName() 
				+ System.currentTimeMillis();
	}

	public Map<String, String> getParameters() {
		return parameters;
	}
	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
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
		if(obj instanceof WebSession) {
			WebSession casted = (WebSession) obj;
			return this.id.equals(casted.id);
		}
		return false;
	}
	
	@Override
	public String toString() {
		Object[] args = {
				this.id,
				this.expiration
				};
		return String.format("WebSession %s(exp: %s)", args);
	}
}
