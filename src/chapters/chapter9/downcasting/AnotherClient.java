package chapters.chapter9.downcasting;

import chapters.chapter9.downcasting.Callback;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println(p * p);
    }
}
