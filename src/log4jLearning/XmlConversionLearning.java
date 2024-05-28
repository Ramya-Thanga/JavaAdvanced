package log4jLearning;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class XmlConversionLearning {

	static Logger logger = Logger.getLogger(XmlConversionLearning.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("log4j.xml");
		logger.debug("This is a debug message");
		logger.info("This is an info");
		logger.warn("This is warning message");
		logger.error("This is error");
		logger.fatal("this is fatal"); 
	}

}
