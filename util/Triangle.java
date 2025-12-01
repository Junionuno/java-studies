package util;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double perimeter(){
        return a + b + c;
    }

    public double semiPerimeter(){
        return (a + b + c) / 2;
    }

    public double area(){
        double s = (a + b + c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public void updateSide(double x, double y, double z){
        this.a = x;
        this.b = y;
        this.c = z;
    }
}
