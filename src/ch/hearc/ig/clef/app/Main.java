/**
 * Package dédié à l'interface utilisateur du Gestionnaire de Clés.
 */
package ch.hearc.ig.clef.app;

import ch.hearc.ig.clef.service.KeyService;
import ch.hearc.ig.clef.service.KeyServiceImpl;
import ch.hearc.ig.clef.business.KeyNotFoundException;

/**
 * Point d'entrée principal de l'application Gestionnaire de Clés.
 * Cette classe initialise le service et effectue des opérations de base
 * pour démontrer les fonctionnalités.
 */
public class Main {

    /**
     * La méthode principale qui exécute le programme.
     *
     * @param args Les arguments de la ligne de commande
     *             (non utilisés dans cette application).
     */
    public static void main(final String[] args) {
        KeyService keyService = new KeyServiceImpl();

        try {
            // Ajoute une nouvelle clé et affiche sa description.
            keyService.addKey("API123", "Mon API de test");
            System.out.println(keyService.getKeyDescription("API123"));

            // Tentative de récupération de la description
            // d'une clé non existante.
            System.out.println(keyService.getKeyDescription("NOTFOUND"));
        } catch (KeyNotFoundException e) {
            // Gestion des erreurs lorsqu'une clé n'est pas trouvée.
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
