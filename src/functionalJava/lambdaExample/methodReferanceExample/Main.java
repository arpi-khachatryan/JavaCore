package functionalJava.lambdaExample.methodReferanceExample;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(2);

        Shapes shapes = (Square s) -> {
            return s.calculateArea();
        };

        System.out.println("Area: " + shapes.getArea(square));


        Shapes shapes2 = Square::calculateArea;
        System.out.println("Area: " + shapes2.getArea(square));
    }
}
