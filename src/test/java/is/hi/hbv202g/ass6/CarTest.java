package is.hi.hbv202g.ass6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class CarTest {
    private static final String BEETLE = "Beetle";
    private Car car;

    @Test
    public void testGetNameOfCar() {
        assertEquals(BEETLE, car.getName());
    }

    @Before
    public void setUp() {
        car = new Car(BEETLE);
    }

}
