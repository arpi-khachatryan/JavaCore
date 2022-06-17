package chapters.chapter8.override;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Ուղղանկյան մակերեսը: ");
        return dim1 * dim2;
    }
}
