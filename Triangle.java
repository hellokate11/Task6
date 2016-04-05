/**
 * Created by Win7 on 02.04.2016.
 */
abstract public class Triangle extends Shape {
    Triangle(int x_t, int y_t){

        super(x_t, y_t);
    }
    void Print(){System.out.print("Triangle");}

    int x_m;
    int y_m;
    void scale (){
        int k =  6;
        x_m = getX()*k;
        y_m = getY()*k;
    }
   int k;
    int g;

    int area()
    {
        return k* g/2; //пусть треугольник прямоугольный
    }
}
