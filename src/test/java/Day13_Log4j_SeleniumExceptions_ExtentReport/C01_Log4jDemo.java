package Day13_Log4j_SeleniumExceptions_ExtentReport;


import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class C01_Log4jDemo {

    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j.properties");
        Logger logger = LogManager.getLogger(C01_Log4jDemo.class.getName());

        logger.trace("Trace Message");
        logger.debug("Debug Message");
        logger.info("Info Message");
        logger.warn("Warn Message");
        logger.error("Error Message");
        logger.fatal("Fatal Message");

    }
}
