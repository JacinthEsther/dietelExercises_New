package chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    @Test
    void rectanglePerimeterTest(){
        Rectangle rectangle = new Rectangle();
        rectangle.calculatePerimeter(2,4);

        assertEquals(12, rectangle.getPerimeter());
    }

    @Test
    void rectangleAreaTest(){
        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea(2,4);

        assertEquals(8, rectangle.getArea());
    }

    @Test
    void lengthMoreThan_19_ThrowsExceptionTest(){
        Rectangle rectangle = new Rectangle();

       assertThrows (IllegalArgumentException.class,()->rectangle.calculateArea(20,4));

    }

 @Test
    void lengthLessThan_0_ThrowsExceptionTest(){
        Rectangle rectangle = new Rectangle();

       assertThrows (IllegalArgumentException.class,()->rectangle.calculateArea(-1,4));

    }

 @Test
    void widthMoreThan_19_ThrowsExceptionTest(){
        Rectangle rectangle = new Rectangle();

       assertThrows (IllegalArgumentException.class,()->rectangle.calculateArea(2,20));

    }

 @Test
    void widthLessThan_0_ThrowsExceptionTest(){
        Rectangle rectangle = new Rectangle();

       assertThrows (IllegalArgumentException.class,()->rectangle.calculateArea(2,0));

    }


}
