/**
 * Package dédié aux entités métier du Gestionnaire de Clés.
 */
package ch.hearc.ig.clef.business;

import java.util.ArrayList;
import java.util.List;

/**
 * Gère les opérations liées aux clés, telles que l'ajout,
 * la recherche et la suppression.
 * Cette classe encapsule la liste des clés,
 * offrant des méthodes pour interagir avec celle-ci.
 */
public class KeyManager {

    /** Liste contenant toutes les clés. */
    private List<Key> keys = new ArrayList<>();

    /**
     * Ajoute une nouvelle clé à la liste.
     *
     * @param key  La clé à ajouter.
     */
    public void addKey(final Key key) {
        keys.add(key);
    }

    /**
     * Recherche une clé dans la liste en fonction de sa valeur.
     *
     * @param keyValue  La valeur unique de la clé à rechercher.
     * @return La clé trouvée ou null si elle n'est pas présente dans la liste.
     */
    public Key findKeyByKeyValue(final String keyValue) {
        for (Key key : keys) {
            if (key.getKeyValue().equals(keyValue)) {
                return key;
            }
        }
        return null;
    }

    /**
     * Supprime une clé de la liste en fonction de sa valeur.
     * Si la clé n'est pas trouvée, une exception
     * KeyNotFoundException est levée.
     *
     * @param keyValue  La valeur unique de la clé à supprimer.
     * @throws KeyNotFoundException Si la clé n'est pas trouvée dans la liste.
     */
    public void deleteKey(final String keyValue) throws KeyNotFoundException {
        Key key = findKeyByKeyValue(keyValue);
        if (key == null) {
            throw new KeyNotFoundException(
                    "Clé non trouvée lors de la suppression: " + keyValue);
        }
        keys.remove(key);
    }
}
