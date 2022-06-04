package chapters.chapter7;

public class OverloadCons2Demo {
    public static void main(String[] args) {
        Box2 mybox1=new Box2(10,20,15);
        Box2 mybox2=new Box2();
        Box2 mycube=new Box2(7);
        Box2 myclone=new Box2(mybox1);

        System.out.println(mybox1.volume());;
        System.out.println(mybox2.volume());
        System.out.println(mycube.volume());
        System.out.println(myclone.volume());
    }
}
