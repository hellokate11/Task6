/**
 * Created by Win7 on 02.04.2016.
 */
abstract public class Rectangle extends Shape {

    Rectangle(int x_r, int y_r) {

        super(x_r, y_r);
    }

    void Print() {
        System.out.print("Rectangle");
    }


    void scale() {
        int k = 2;
        int x_m = getX() * k;
        int y_m = getY() * k;
    }

    int w;
    int h;

    int area() {
        return w * h;
    }
}
