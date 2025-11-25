package entities;

public class Circle {
    public double radius;

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }
}
