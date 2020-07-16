package real.core.model.web;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

/**
 * Premisa: Crear testing desde un objetivo básico y hacerlo evolucionar.
 * No hay aún un análisis detallado sobre que probar y cómo probar.
 * Esto un test exploratorio.
 * La base es la calidad, la cual va determinando que el resultado
 * final cumple ciertas condiciones mínimas.
 * 15-07-2020
 * @author rmunoz
 *
 */
public class NavigatorTest {

	@Test
	public void navigateToSuccessWebSite() {
		Navigator navigator = new Navigator();
		
		try {
			Optional<Object> result = navigator.navigateTo(null).getResult();
			Assert.assertTrue(result.isPresent());
			fail("Incomplete implementation");
		} catch (IOException e) {
			e.printStackTrace();
			fail("Generate IOException when a good website is used.");
		}
	}
	
	@Test
	public void navigateToNonExistWebSite() {
		fail("Not yet implemented");
	}

}
