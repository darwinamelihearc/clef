/**
 * Package dédié aux services du Gestionnaire de Clés.
 */
package ch.hearc.ig.clef.service;

import ch.hearc.ig.clef.business.Key;
import ch.hearc.ig.clef.business.KeyManager;
import ch.hearc.ig.clef.business.KeyNotFoundException;

/**
 * Implémentation du service de gestion des clés.
 * Cette classe réalise les opérations définies par l'interface {@link KeyService} en utilisant le gestionnaire {@link KeyManager}.
 */
public class KeyServiceImpl implements KeyService {

    /** Le gestionnaire de clés utilisé pour les opérations CRUD. */
    private KeyManager keyManager = new KeyManager();

    /**
     * {@inheritDoc}
     */
    @Override
    public void addKey(String keyValue, String description) {
        Key key = new Key(keyValue, description);
        keyManager.addKey(key);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getKeyDescription(String keyValue) throws KeyNotFoundException {
        Key key = keyManager.findKeyByKeyValue(keyValue);
        if (key == null) {
            throw new KeyNotFoundException("Clé non trouvée: " + keyValue);
        }
        return key.getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteKey(String keyValue) throws KeyNotFoundException {
        keyManager.deleteKey(keyValue);
    }
}
