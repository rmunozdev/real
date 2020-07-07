package real.samples.math;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * Basic calculator.
 * 06-07-2020
 * @author rmunoz
 *
 */
public class Calculator {

	private static Logger logger = LogManager.getLogger(Calculator.class);
	
	/**
	 * Addition of two long values.
	 * @param alpha
	 * @param beta
	 * @return
	 */
	public long add(long alpha, long beta) {
		logger.info("Perform add(" + alpha + "," + beta + ")");
		return alpha + beta;
	}
}
