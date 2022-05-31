package dataStructureAndAlgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    Stack stack;
    @BeforeEach
    void setUp(){
    stack = new Stack(5);
    }

    @Test
    void testThatStackIsEmpty(){

        assertNotNull(stack);
        assertEquals(0, stack.size());
    }

    @Test
    void testForAdditionOfElementInAStack__Push(){
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());

    }

    @Test
    void testToAssertThatPushingWhenStackIsFullThrowsError(){
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
      assertThrows(ArrayIndexOutOfBoundsException.class,()->stack.push(6));

    }

    @Test
    void testToAssertForAFullStack(){
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }


    @Test
    void testForRemovalFromStack(){
        stack.push(5);
        stack.push(3);
        stack.pop();
        assertEquals(1, stack.size());
    }

    @Test
    void testThatWhenStackIsEmptyPopThrowsError(){
        stack.push(3);
        stack.pop();
        assertThrows(ArrayIndexOutOfBoundsException.class,()->stack.pop());

    }

    @Test
    void testToAssertForAnEmptyStack(){
        stack.push(3);
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}

