package chapters.chapter9.downcasting;

import chapters.chapter9.downcasting.Callback;

public class Client implements Callback {
    @Override
    public void callback(int p) {
        System.out.println(p);
    }

    void nonIfaceMeth() {
        System.out.println("callback մեթոդը վերեւի, որը interface-ի մեթոդն է, պետք է պարտադիր public լինի");
    }
}
