package Day13_Log4j_SeleniumExceptions_ExtentReport;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class C02_Log4jDemo {

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        Logger logger =Logger.getLogger(C02_Log4jDemo.class.getName());

        logger.trace("Trace Message");
        logger.debug("Debug Message");
        logger.info("Info Message");
        logger.warn("Warn Message");
        logger.error("Error Message");
        logger.fatal("Fatal Message");

    }
}
