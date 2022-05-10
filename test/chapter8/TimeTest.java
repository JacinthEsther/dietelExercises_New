package chapter8;


import chapter8.time.Time2;
import chapter8.time.TimeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TimeTest {

    @Test
    void timeConstructorWithThreeArgumentsTest(){
        Time2 time = new Time2(23,59,59);

       assertEquals(23, time.getHour());
       assertEquals(59, time.getMinute());
       assertEquals(59, time.getSecond());
    }

    @Test
    void timeConstructorWithTwoArgumentsTest(){
        Time2 time = new Time2(23,59);

        assertEquals(23, time.getHour());
        assertEquals(59, time.getMinute());
       assertEquals(0, time.getSecond());
    }

   @Test
    void timeConstructorWithOneArgumentTest(){
        Time2 time = new Time2(23);

       assertEquals(23, time.getHour());
       assertEquals(0, time.getMinute());
       assertEquals(0, time.getSecond());
    }

    @Test
    void hourMustBeLessThan24Test(){
        Time2 time  = new Time2(23);
      assertThrows(TimeException.class,()-> time.setHour(24));
    }

    @Test
    void hourMustNotBeLessThan_0_Test(){
        Time2 time  = new Time2(23);
      assertThrows(TimeException.class,()-> time.setHour(-1));
    }

 @Test
    void minuteMustBeLessThan60Test(){
        Time2 time  = new Time2(23,1);
      assertThrows(TimeException.class,()-> time.setMinute(60));
    }

    @Test
    void minuteMustNotBeLessThan_0_Test(){
        Time2 time  = new Time2(23,1);
      assertThrows(TimeException.class,()-> time.setMinute(-1));
    }

 @Test
    void secondMustBeLessThan60Test(){
        Time2 time  = new Time2(23,1,1);
      assertThrows(TimeException.class,()-> time.setSecond(60));
    }

    @Test
    void secondMustNotBeLessThan_0_Test(){
        Time2 time  = new Time2(23);
      assertThrows(TimeException.class,()-> time.setSecond(-1));
    }

    @Test
    void testForConstructorThatCallsAConstructor(){
        Time2 time  = new Time2(23,1,1);
        Time2 time2 = new Time2(time.getHour(),time.getMinute(),time.getSecond());

        assertEquals(23, time2.getHour());
        assertEquals(1,time2.getMinute());
        assertEquals(1,time2.getSecond());
    }

    @Test
    void testForNumberOfSecondsSinceMidNightForHourMinuteAndSecond(){
        Time2 time  = new Time2(23,1,1);

        assertEquals(82861, time.getNumberOfSecondsSinceMidnight());

    }

    @Test
    void testForNumberOfSecondsSinceMidNightForHourAndMinute(){
        Time2 time  = new Time2(12,23);

        assertEquals(44580, time.getNumberOfSecondsSinceMidnight());

    }

    @Test
    void testForNumberOfSecondsSinceMidNightForHour(){
        Time2 time  = new Time2(12);

        assertEquals(43200, time.getNumberOfSecondsSinceMidnight());

    }

}
