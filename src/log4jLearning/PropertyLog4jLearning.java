package log4jLearning;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog4jLearning {
	
	static Logger logger = Logger.getLogger(PropertyLog4jLearning.class); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("log4j.properties");
		
		logger.debug("This is a debug message");
		logger.info("This is an info");
		logger.warn("This is warning message");
		logger.error("This is error");
		logger.fatal("this is fatal");

	}

}
