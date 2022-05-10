package chapter8;

public class Rectangle {

    float length=1;
    float width=1;

    double perimeter= 0.0;
    double area =0.0;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if(length < 0|| length > 19 ){
            throw new IllegalArgumentException("width should be between 1 and 19");
        }

        this.length=length;

    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if(width < 0|| width > 19 ){
            throw new IllegalArgumentException("width should be between 1 and 19");
        }
        this.width = width;
    }

    public void calculatePerimeter(float length, float width) {
       setLength(length);
      setWidth(width);
        perimeter= 2*(getLength() + getWidth());
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void calculateArea(float length, float width) {
        setLength(length);
        setWidth(width);



        area = length* width;


    }

    public double getArea() {
        return area;
    }
}
