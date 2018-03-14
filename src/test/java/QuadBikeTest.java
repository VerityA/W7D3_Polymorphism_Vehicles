import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadBikeTest {

    QuadBike quadBike;

    @Before
    public void before() {
        quadBike = new QuadBike(20, 3);
    }

    @Test
    public void canGetAverageSpeed() {
        assertEquals(20, quadBike.getAverageSpeed());
    }

    @Test
    public void canGetEngineCapacity() {
        assertEquals(3, quadBike.getEngineCapacity());
    }

    @Test
    public void canGetTimeRequiredToTravelDistance() {
        assertEquals(5, quadBike.driveTimeToTravelDistance(100));
    }


}
