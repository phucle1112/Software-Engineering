import Triangle.Triangle;
import Triangle.Type;

import org.junit.Test;

import static Triangle.Type.*;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void test1() {
        final Type type = Triangle.classify(1, 2, 3);
        assertEquals(SCALENE, type);
    }

    @Test
    public void testInvalid1() {
        final Type type = Triangle.classify(1, 2, 4);
        assertEquals(INVALID, type);
    }

    @Test
    public void testInvalid2() {
        final Type type = Triangle.classify(1, 4, 2);
        assertEquals(INVALID, type);
    }

    @Test
    public void testInvalidNeg1() {
        final Type type = Triangle.classify(-1, 1, 1);
        assertEquals(INVALID, type);
    }

    @Test
    public void testInvalidNeg2() {
        final Type type = Triangle.classify(1, -1, 1);
        assertEquals(INVALID, type);
    }


    @Test
    public void testEquiliteral() {
        final Type type = Triangle.classify(1, 1, 1);
        assertEquals(EQUILATERAL, type);
    }

    @Test
    public void testIsoceles1() {
        final Type type = Triangle.classify(2, 2, 3);
        assertEquals(ISOSCELES, type);
    }

    @Test
    public void testIsoceles2() {
        final Type type = Triangle.classify(2, 3, 2);
        assertEquals(ISOSCELES, type);
    }

}