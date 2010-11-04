package ch.netgeek.jmock.example;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMock.class)
public class CarTest {

    /** jmock context */
    Mockery context;
    /** instance under test */
    Car car;
    
    @Before
    public void setUp() {
        context = new JUnit4Mockery();
        car = new Car();
    }
    
    
    /**
     * Drive with the car
     */
    @Test
    public void driveCar() {
        // set up
        final Tire tire = context.mock(Tire.class);
        final double milliMeters = 0.1;
        final int kilometers = 5;
                  
        // define expectations
        context.checking(new Expectations() {{
            
            // one (tire).wearDown(kilometers * milliMeters);
            // between(0, 1).of (tire).wearDown(kilometers * milliMeters);
            // exactly(4).of (tire).wearDown(kilometers * milliMeters);
            
        }});
        
        // car.drive(kilometers);
    }
    
}
