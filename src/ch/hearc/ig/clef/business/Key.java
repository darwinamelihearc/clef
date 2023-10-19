/**
 * Package dédié aux entités métier du Gestionnaire de Clés.
 */
package ch.hearc.ig.clef.business;

/**
 * Représente une clé avec ses propriétés associées.
 * Chaque clé possède une valeur unique (keyValue) et une description.
 */
public class Key {

    /** La valeur unique de la clé. (ID) */
    private String keyValue;

    /** La description associée à la clé. */
    private String description;

    /**
     * Construit une nouvelle instance de clé avec une valeur
     * et une description spécifiées.
     *
     * @param keyValue     La valeur unique de la clé.
     * @param description  La description associée à la clé.
     */
    public Key(final String keyValue, final String description) {
        this.keyValue = keyValue;
        this.description = description;
    }

    /**
     * Récupère la valeur de la clé. (ID)
     *
     * @return La valeur unique de la clé. (ID)
     */
    public String getKeyValue() {
        return keyValue;
    }

    /**
     * Récupère la description de la clé.
     *
     * @return La description associée à la clé.
     */
    public String getDescription() {
        return description;
    }
}
