package chapters.chapter13.accessModifiers;

import org.omg.CORBA.Object;

public class InstanceOfDemo {
    public static void main(String[] args) {
        InstanceOf a = new InstanceOf();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof InstanceOf) {
            System.out.println("a-ն A-ի էկզեմպլյարն է");
        }
        if (b instanceof B) {
            System.out.println("b-ն B-ի էկզեմպլյարն է");
        }
        if (c instanceof C) {
            System.out.println("c-ն C-ի էկզեմպլյարն է");
        }
        if (c instanceof InstanceOf) {
            System.out.println("c-ն կարելի է վերագրել A-ին");
        }
        if (a instanceof C) {
            System.out.println("a-ն կարելի է վերագրել C-ին");
        }

        System.out.println();

        InstanceOf ob;
        ob = d;
        if (ob instanceof D) {
            System.out.println("ob-ը D-ի էկզեմպլյարն է");
            System.out.println();
            ob = c;
            if (ob instanceof D) {
                System.out.println("ob-ը կարելի է վերագրել D-ին");
            } else {
                System.out.println("ob-ը չի կարելի վերագրել D-ին");
            }
            if (ob instanceof InstanceOf) {
                System.out.println("ob-ը կարելի է վերագրել A-ին");
            }

            System.out.println();

            if (a instanceof Object) {
                System.out.println("a -ն կարելի է վերագրել Object-ին");
            }
            if (b instanceof Object) {
                System.out.println("b-ն կարելի է վերագրել Object-ին");
            }
            if (c instanceof Object) {
                System.out.println("c-ն կարելի է վերագրել Object-ին");
            }
            if (d instanceof Object) {
                System.out.println("d-ն կարելի է վերագրել Object-ին");
            }
        }
    }
}