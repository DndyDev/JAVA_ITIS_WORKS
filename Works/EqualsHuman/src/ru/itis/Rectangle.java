package ru.itis;

/**
 * Created by Sergey on 29.03.2017.
 */
public class Rectangle {
    private int a;
    private int b;

   public Rectangle (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public int area(){
        return a*b;
    }

    public boolean equalsRectangle(Object object){
        Rectangle that = (Rectangle)object;
         return this.area() == that.area();
    }
    public String toString(){
        return area() + "" + this.area();

    }
    public  int compareTo(Object object){
        Rectangle that1  = (Rectangle)object;
        if(this.area() > that1.area() && this.area() < that1.area()){
            return this.area()  - that1.area();
        }else{
            return 0;
        }
    }
}
