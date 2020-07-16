package real.core.model.web;

import java.io.IOException;
import java.util.Optional;

/**
 * Model component of web navigation.
 * Web navigation could has many request, 
 * grouped by distinct web sites.
 * 10-07-20
 * TODO This navigator could not be a bean, since
 * it coul storage many behavioral operations.  
 * @author rmunoz
 *
 */
public class Navigator {

	public Navigator navigateTo(WebSite site) throws IOException {
		return this;
	}
	
	public Navigator then(WebSite site) throws IOException {
		return this;
	}
	
	public <T> Optional<T> getResult() throws IOException {
		return Optional.empty();
	}
	
	
}
