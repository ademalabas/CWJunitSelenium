package utilities;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4j {


    private static Logger log = LogManager.getLogger(Log4j.class.getName());

        
    public static void startLog (String testClassName){
        log.info("Test is Starting...");
    }

        
    public static void endLog (String testClassName){
        log.info("Test is Ending...");
    }


    //Info Level
    public static void info (String message) {
        log.info(message);
    }


    //Warn Level
    public static void warn (String message) {
        log.warn(message);
    }

    //Trace Level
    public static void trace (String message) {
        log.trace(message);
    }

    //Error Level
    public static void error (String message) {
        log.error(message);
    }

    //Fatal Level
    public static void fatal (String message) {
        log.fatal(message);
    }

    //Debug Level
    public static void debug (String message) {
        log.debug(message);
    }


}
