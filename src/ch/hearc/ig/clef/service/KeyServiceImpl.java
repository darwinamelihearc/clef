/**
 * Package dédié aux services du Gestionnaire de Clés.
 */
package ch.hearc.ig.clef.service;

import ch.hearc.ig.clef.business.Key;
import ch.hearc.ig.clef.business.KeyManager;
import ch.hearc.ig.clef.business.KeyNotFoundException;
import ch.hearc.ig.clef.business.ValidationException;

/**
 * Implémentation du service de gestion des clés.
 * Cette classe réalise les opérations définies
 * par l'interface {@link KeyService} en utilisant
 * le gestionnaire {@link KeyManager}.
 */
public class KeyServiceImpl implements KeyService {

    /** Le gestionnaire de clés utilisé pour les opérations CRUD. */
    private KeyManager keyManager = new KeyManager();

    /**
     * {@inheritDoc}
     */
    @Override
    public void addKey(final String keyValue, final String description) throws ValidationException {
        validateKeyInput(keyValue, description);
        Key key = new Key(keyValue, description);
        keyManager.addKey(key);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getKeyDescription(final String keyValue)
            throws KeyNotFoundException {
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
    public void deleteKey(final String keyValue) throws KeyNotFoundException {
        keyManager.deleteKey(keyValue);
    }

    private void validateKeyInput(String keyValue, String description) throws ValidationException {
        if (keyValue == null || keyValue.length() < 3) {
            throw new ValidationException("La valeur de la clé doit avoir au moins 3 caractères.");
        }

        if (description == null || description.length() < 5) {
            throw new ValidationException("La description doit avoir au moins 5 caractères.");
        }
    }
}
