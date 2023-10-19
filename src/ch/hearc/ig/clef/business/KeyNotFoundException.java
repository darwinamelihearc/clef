/**
 * Package dédié aux entités métier du Gestionnaire de Clés.
 */
package ch.hearc.ig.clef.business;

/**
 * Exception personnalisée indiquant qu'une clé n'a pas été trouvée.
 * Cette exception est généralement levée lorsque
 * des opérations de recherche ou de suppression sont effectuées
 * sur une clé inexistante.
 */
public class KeyNotFoundException extends Exception {

    /**
     * Construit une nouvelle instance de KeyNotFoundException
     * avec un message d'erreur spécifié.
     *
     * @param message  Le message détaillant la raison de l'exception.
     */
    public KeyNotFoundException(final String message) {
        super(message);
    }
}
