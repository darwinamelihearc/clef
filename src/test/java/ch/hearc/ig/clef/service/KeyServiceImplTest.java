package ch.hearc.ig.clef.service;

import ch.hearc.ig.clef.business.KeyNotFoundException;
import ch.hearc.ig.clef.service.KeyService;
import ch.hearc.ig.clef.service.KeyServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyServiceImplTest {

    private KeyService keyService;

    @Before
    public void setUp() throws Exception {
        keyService = new KeyServiceImpl();
    }

    @Test
    public void addAndGetKeyDescription() throws KeyNotFoundException {
        String keyValue = "TEST123";
        String description = "Description de test";

        keyService.addKey(keyValue, description);
        String retrievedDescription = keyService.getKeyDescription(keyValue);

        assertEquals(description, retrievedDescription);
    }

    @Test(expected = KeyNotFoundException.class)
    public void getKeyDescriptionForNonExistentKey() throws KeyNotFoundException {
        keyService.getKeyDescription("NONEXISTENT");
    }

    @Test
    public void deleteKey() throws KeyNotFoundException {
        String keyValue = "DELETE123";
        keyService.addKey(keyValue, "Description pour suppression");
        keyService.deleteKey(keyValue);

        // Vérifier que la clé est bien supprimée
        try {
            keyService.getKeyDescription(keyValue);
            fail("La clé n'a pas été supprimée!");
        } catch (KeyNotFoundException e) {
            // Attendu
        }
    }
}
