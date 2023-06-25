package diferent.dynamicMethod_Dispatch_Invocation;

interface Shape {

    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

class Drawer<T extends Shape> {
    public void draw(T shape) {
        shape.draw();
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {
        Drawer<Circle> circleDrawer = new Drawer<>();
        Drawer<Square> squareDrawer = new Drawer<>();
        circleDrawer.draw(new Circle());
        squareDrawer.draw(new Square());
    }
}
