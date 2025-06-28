import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDemo {
    private static final Logger logger = LoggerFactory.getLogger(LoggerDemo.class);

    public static void main(String[] args) {
        logger.info("🟢 Info: Application started");
        logger.warn("🟡 Warning: Low disk space");
        logger.error("🔴 Error: Unable to connect to server");

        int result = divide(10, 2);
        logger.info("Division result: " + result);

        divide(10, 0); // Triggers error log
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            logger.error("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
}
  