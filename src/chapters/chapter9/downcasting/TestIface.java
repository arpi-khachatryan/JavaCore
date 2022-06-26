package chapters.chapter9.downcasting;

import chapters.chapter9.downcasting.AnotherClient;
import chapters.chapter9.downcasting.Callback;
import chapters.chapter9.downcasting.Client;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(25);
        AnotherClient ob = new AnotherClient();
        c = ob;
        c.callback(25);
    }
}