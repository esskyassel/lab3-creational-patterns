interface Logger {
    void log(String message);
}

class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println(message);
    }
}

abstract class LoggerFactory {
    public abstract Logger createLogger();
}

class ConsoleLoggerFactory extends LoggerFactory {
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}

public class FactoryMethodExample {
    public static void main(String[] args) {
        LoggerFactory factory = new ConsoleLoggerFactory();
        Logger logger = factory.createLogger();
        logger.log("Factory Method works");
    }
}
