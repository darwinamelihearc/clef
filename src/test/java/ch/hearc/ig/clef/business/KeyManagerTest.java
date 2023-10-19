package ch.hearc.ig.clef.business;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyManagerTest {

    private KeyManager keyManager;

    @Before
    public void setUp() {
        keyManager = new KeyManager();
    }

    @Test
    public void addAndFindKey() {
        Key key = new Key("ADDTEST", "Description pour ajout");
        keyManager.addKey(key);

        Key retrievedKey = keyManager.findKeyByKeyValue("ADDTEST");
        assertNotNull(retrievedKey);
        assertEquals("Description pour ajout", retrievedKey.getDescription());
    }

    @Test
    public void findNonExistentKey() {
        assertNull(keyManager.findKeyByKeyValue("NONEXISTENT"));
    }

    @Test
    public void deleteKey() throws KeyNotFoundException {
        Key key = new Key("DELETEKEY", "Description pour suppression");
        keyManager.addKey(key);

        keyManager.deleteKey("DELETEKEY");
        assertNull(keyManager.findKeyByKeyValue("DELETEKEY"));
    }

    @Test(expected = KeyNotFoundException.class)
    public void deleteNonExistentKey() throws KeyNotFoundException {
        keyManager.deleteKey("NONEXISTENTKEY");
    }
}
