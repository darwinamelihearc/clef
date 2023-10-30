/**
 * Package dédié aux services du Gestionnaire de Clés.
 */
package ch.hearc.ig.clef.service;

import ch.hearc.ig.clef.business.KeyNotFoundException;
import ch.hearc.ig.clef.business.ValidationException;

/**
 * Interface définissant les services relatifs à la gestion des clés.
 * Cette interface stipule les méthodes pour ajouter,
 * récupérer la description et supprimer des clés.
 */
public interface KeyService {

    /**
     * Ajoute une nouvelle clé avec la valeur et la description spécifiées.
     *
     * @param keyValue     La valeur unique ou identifiant de la clé.
     * @param description  La description associée à la clé.
     * @throws ValidationException Vérifie la valeur et la description
     * avant d'ajouter la clé
     */
    void addKey(String keyValue, String description) throws ValidationException;

    /**
     * Récupère la description d'une clé en fonction de sa valeur.
     *
     * @param keyValue  La valeur unique ou identifiant de la clé
     *                  dont la description doit être récupérée. (ID)
     * @return La description associée à la clé spécifiée.
     * @throws KeyNotFoundException Si la clé avec la valeur spécifiée
     * n'est pas trouvée.
     */
    String getKeyDescription(String keyValue) throws KeyNotFoundException;

    /**
     * Supprime une clé en fonction de sa valeur.
     *
     * @param keyValue  La valeur unique ou identifiant de
     *                  la clé à supprimer. (ID)
     * @throws KeyNotFoundException Si la clé avec la valeur
     *                  spécifiée n'est pas trouvée.
     */
    void deleteKey(String keyValue) throws KeyNotFoundException;
}
