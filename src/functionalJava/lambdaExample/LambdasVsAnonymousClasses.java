package functionalJava.lambdaExample;

import functionalJava.NoArgFunction;

public class LambdasVsAnonymousClasses {

    public static void main(String[] args) {

        NoArgFunction funcAnonymous = new NoArgFunction() {
            @Override
            public Object apply() {
                return null;
            }
        };
        funcAnonymous.apply();

        //Lambda

        NoArgFunction funcLambda = () -> "Hello functional!";
        funcLambda.apply();
    }
}
