package ch.hearc.ig.clef.business;

import java.util.ArrayList;
import java.util.List;

public class KeyManager {
    private List<Key> keys = new ArrayList<>();

    public void addKey(Key key) {
        keys.add(key);
    }

    public Key findKeyByKeyValue(String keyValue) {
        for (Key key : keys) {
            if (key.getKeyValue().equals(keyValue)) {
                return key;
            }
        }
        return null;
    }

    public void deleteKey(String keyValue) throws KeyNotFoundException {
        Key key = findKeyByKeyValue(keyValue);
        if (key == null) {
            throw new KeyNotFoundException("Clé non trouvée lors de la suppression: " + keyValue);
        }
        keys.remove(key);
    }
}

