package NelioAlves.util;

public class rectangle {
    public double height;
    public double width;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2 * (width + height);
    }

    public void updateDimensions(double height, double width) {
        this.height = height;
        this.width = width;
    }
}
