package classwork.patterns.observer;

public class EmailAlertsListener implements EventListener {

    private String email;
    private String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String filename) {
        // Email alerts logic
        System.out.println(String.format(message, filename));
    }
}