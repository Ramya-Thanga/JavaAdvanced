package log4jLearning;
import org.apache.log4j.*;

public class BasicConfiguratorLog4J {
    static Logger logger = Logger.getLogger(BasicConfiguratorLog4J.class);
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	BasicConfigurator.configure(); 	
	logger.debug("This is a debug message");
	logger.info("This is an info");
	logger.warn("This is warning message");
	logger.error("This is error");
	logger.fatal("this is fatal");
	}

}
