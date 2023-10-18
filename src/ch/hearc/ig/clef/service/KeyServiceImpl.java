package ch.hearc.ig.clef.service;

import ch.hearc.ig.clef.business.Key;
import ch.hearc.ig.clef.business.KeyManager;
import ch.hearc.ig.clef.business.KeyNotFoundException;

public class KeyServiceImpl implements KeyService {
    private KeyManager keyManager = new KeyManager();

    @Override
    public void addKey(String keyValue, String description) {
        Key key = new Key(keyValue, description);
        keyManager.addKey(key);
    }

    @Override
    public String getKeyDescription(String keyValue) throws KeyNotFoundException {
        Key key = keyManager.findKeyByKeyValue(keyValue);
        if (key == null) {
            throw new KeyNotFoundException("Clé non trouvée: " + keyValue);
        }
        return key.getDescription();
    }

    @Override
    public void deleteKey(String keyValue) throws KeyNotFoundException {
        keyManager.deleteKey(keyValue);
    }
}
