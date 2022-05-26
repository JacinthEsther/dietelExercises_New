package chapter8;

import chapter8.time.TickTime;
import chapter8.time.Time2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TickTimeTest {

    @Test
    void testForIncrementSeconds(){
        Time2 tickTime = new Time2(1,1,1);
        TickTime tick =new TickTime(tickTime);
        tick.incrementSeconds();
        assertEquals(2, tick.getSecond());

    }

   @Test
    void testForIncrementMinute(){
        Time2 tickTime = new Time2(1,1,1);
        TickTime tick =new TickTime(tickTime);

        tick.incrementSeconds();
        tick.incrementMinutes();

        assertEquals(2, tick.getSecond());
        assertEquals(2, tick.getMinute());

    }

        @Test
        void testForIncrementHour(){
            Time2 tickTime = new Time2(1,1,1);
            TickTime tick =new TickTime(tickTime);

            tick.incrementSeconds();
            tick.incrementMinutes();
            tick.incrementHours();

            assertEquals(2, tick.getSecond());
            assertEquals(2, tick.getMinute());
            assertEquals(2, tick.getHour());

        }

    @Test
        void testForSecondsIncrementingIntoTheNextMinute(){
            Time2 tickTime = new Time2(1,1,59);
            TickTime tick =new TickTime(tickTime);

            tick.incrementSeconds();

            assertEquals(0, tick.getSecond());
            assertEquals(2, tick.getMinute());
        }


         @Test
        void testForMinuteIncrementingIntoTheNextHour(){
            Time2 tickTime = new Time2(1,59,59);
            TickTime tick =new TickTime(tickTime);

            tick.incrementSeconds();
            assertEquals(0, tick.getSecond());
            assertEquals(0, tick.getMinute());
            assertEquals(2, tick.getHour());
        }

   @Test
        void testForMinuteIncrementingIntoTheNextDay(){
            Time2 tickTime = new Time2(11,59,59);
            TickTime tick =new TickTime(tickTime);

            tick.incrementSeconds();
            assertEquals(0, tick.getSecond());
            assertEquals(0, tick.getMinute());
            assertEquals(12, tick.getHour());
        }




}
