import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    public void testTriangle(){
        Triangle practice = new Triangle();
        assertEquals("Triangle: isosceles", practice.triangle(4, 4, 7));
        assertEquals("Triangle: equilateral", practice.triangle(4, 4, 4));
        assertEquals("It is not a triangle.", practice.triangle(4, 4, 9));
        assertEquals("Triangle: scalene", practice.triangle(7, 4, 5));
        assertEquals("Triangle: scalene right-angle", practice.triangle(5, 4, 3));
    }
}
