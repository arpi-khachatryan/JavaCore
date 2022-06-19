package chapters.chapter8.abstractClasses;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return dim1 * dim2 / 2;
    }
}
