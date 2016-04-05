/**
 * Created by Win7 on 02.04.2016.
 **/
abstract public class Circle extends Shape {


    Circle(int x_c, int y_c){

        super(x_c, y_c);
    }
    void Print() {
        System.out.print("Circle");
    }

    int x_m;
    int y_m;

    void scale() {
        int k = 7;
        x_m = getX() * k;
        y_m = getY() * k;
    }

    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }


    int area() {
        return (int) Math.PI * r * r;
    }

    public void point(int x, int y) {
        if ((getX() + x) < getR() && (getY() + y) < getR()) {
            System.out.print("In Circle");
        } else
            System.out.print("Not in Circle");
    }

    public void cinc(int x, int y, int r) {
        if ((getX() + x) < getR() && (getY() + y) < getR()) {
            {
                if (getR() > r)
                    System.out.print("Circle in Circle");
                else
                    System.out.print("Not in Circle");
            }
        } else
            System.out.print("Not in Circle");
    }

}
