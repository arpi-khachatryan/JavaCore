package chapters.chapter7;

public class OverloadCons {
    double width;
    double height;
    double depth;

    OverloadCons(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    OverloadCons() {
        width = -1;
        height = -1;
        depth = -1;
    }

    OverloadCons(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
