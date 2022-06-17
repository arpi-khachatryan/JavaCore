package chapters.chapter8.override;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Եռանկյան մակերեսը:  ");
        return dim1 * dim2 / 2;
    }
}
