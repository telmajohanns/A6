package is.hi.hbv202g.ass6;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class CarOwnerTest {

    private Car car;
    private CarOwner carOwner;

    @Test
    public void testGetName() {
        assertEquals("John Doe", carOwner.getName());
    }

    @Before
    public void setUp() {
        car = new Car("Beetle");
        carOwner = new CarOwner("John Doe", car);
    }

}