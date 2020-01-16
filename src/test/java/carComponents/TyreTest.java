package carComponents;
import carComponents.Tyre;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {
    private Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre();
    }

    @Test
    public void canGetTyreColour(){
        assertEquals("black", tyre.getColourTypeDescription());
    }
}

