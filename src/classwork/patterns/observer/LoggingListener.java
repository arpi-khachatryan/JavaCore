package classwork.patterns.observer;

import java.io.File;

public class LoggingListener implements EventListener {

    private File log;
    private String message;

    public LoggingListener(String logFilename, String message) {
        this.log = new File(logFilename);
        this.message = message;
    }

    @Override
    public void update(String filename) {
        // Logging logic
        // System.out.println(String.format(message, filename));
        System.out.printf((message) + "%n", filename);
    }
}
