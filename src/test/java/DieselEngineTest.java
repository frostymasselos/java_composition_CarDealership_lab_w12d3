import carComponents.DieselEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DieselEngineTest {

    private DieselEngine dEngine;

    @Before
    public void before () {
        dEngine = new DieselEngine();
    }

    @Test
    public void canGetPower(){
        assertEquals(9, dEngine.getPower());
    }

    @Test
    public void canGetPollutionRating(){
        assertEquals(9, dEngine.getPollutionRating());
    }
}
