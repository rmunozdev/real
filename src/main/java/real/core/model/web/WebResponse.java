package real.core.model.web;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Model Web Response, generated after request processing 
 * from external source.
 * This response dont guarentee a success request
 * process, it need to be validate.
 * @author rmunoz
 *
 */
public class WebResponse {

	private String id;
	private Map<String,String> headers;
	private String body;
	private String code;
	
	public WebResponse(String code) {
		this.id = "WRESP_" 
				+ Thread.currentThread().getName() 
				+ System.currentTimeMillis();
		this.code = code;
		this.headers = new HashMap<>();
	}
	
	public String getId() {
		return id;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	@Override
	public int hashCode() {
		Objects.requireNonNull(this.id);
		return this.id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Objects.requireNonNull(this.id);
		if(obj instanceof WebResponse) {
			WebResponse casted = (WebResponse) obj;
			return this.id.equals(casted.id);
		}
		return false;
	}
	
	@Override
	public String toString() {
		Object[] args = {
				this.id,
				this.code,
				this.body.length()
				};
		return String.format("WebResponse %s(%s, length:%s)", args);
	}
	
}
