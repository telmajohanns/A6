package is.hi.hbv202g.ass6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    @Test
    public void testGetNameOfCar() {
        Car car = new Car("Beetle");
        assertEquals("Beetle", car.getName());
    }

}
