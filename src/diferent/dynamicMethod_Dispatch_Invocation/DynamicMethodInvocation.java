package diferent.dynamicMethod_Dispatch_Invocation;

import java.lang.reflect.Method;

public class DynamicMethodInvocation {

    public static void main(String[] args) throws Exception {
        MyClass instance = new MyClass();
        Method method = MyClass.class.getMethod("myMethod", String.class);
        String result = (String) method.invoke(instance, "Hello, World!");
        System.out.println(result); // Output: "You said: Hello, World!"
    }
}

class MyClass {
    public String myMethod(String message) {
        return "You said: " + message;
    }
}
