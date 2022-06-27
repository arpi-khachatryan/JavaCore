package chapters.chapter9.defaultMethod;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIfImp1 myIfImp1 = new MyIfImp1();
        System.out.println(myIfImp1.getNumber());
        System.out.println(myIfImp1.getString());

        MyIfImp2 myIfImp2 = new MyIfImp2();
        System.out.println(myIfImp2.getNumber());
        System.out.println(myIfImp2.getString());
    }
}
