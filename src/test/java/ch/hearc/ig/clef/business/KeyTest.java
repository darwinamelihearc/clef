package ch.hearc.ig.clef.business;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyTest {

    public Key key;

    @Before
    public void setUp() {
        key = new Key("TESTKEY", "Description de test");
    }

    @Test
    public void testGetKeyValue() {
        assertEquals("TESTKEY", key.getKeyValue());
    }

    @Test
    public void testGetDescription() {
        assertEquals("Description de test", key.getDescription());
    }
}
