import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DriverTest {

    Driver driver;
    Vehicle vehicle;

    @Before
    public void before() {
        vehicle = new QuadBike(10, 5);
        driver = new Driver("Verity", vehicle);
    }

    @Test
    public void canGetVehicle() {
        assertEquals(vehicle, driver.getVehicle());
    }

    @Test
    public void canGetTimeRequiredToTravelDistance() {
        assertEquals(10, driver.timeTakenToDriveDistance(100));
    }

    @Test
    public void canChangeDrivableVehicle() {
        IDrivable newVehicle = new Dodgem(4, 2);
        driver.setVehicle(newVehicle);
        assertEquals(newVehicle, driver.getVehicle());
    }
}
