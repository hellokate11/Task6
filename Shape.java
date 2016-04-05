/**
 * Created by Win7 on 02.04.2016.
 */

abstract public class Shape {
   private int x;
    private int y;

 Shape(int x, int y)
 {
  setX(x);
  setY(y);
 }

    public int getX()
    {return x;}
    public void setX(int x)
    {this.x = x;}

    public int getY()
    {return y;}
    public void setY(int y)
    {this.y = y;}

    abstract void Print ();

    public void Move(int x1, int y1)
    {
        setX(x + x1);
        setY(y + y1);
    }
    abstract void scale();
    abstract int area();



}
