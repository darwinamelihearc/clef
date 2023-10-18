package ch.hearc.ig.clef.app;

import ch.hearc.ig.clef.service.KeyService;
import ch.hearc.ig.clef.service.KeyServiceImpl;
import ch.hearc.ig.clef.business.KeyNotFoundException;

public class Main {
    public static void main(String[] args) {
        KeyService keyService = new KeyServiceImpl();

        try {
            keyService.addKey("API123", "Mon API de test");
            System.out.println(keyService.getKeyDescription("API123"));
            System.out.println(keyService.getKeyDescription("NOTFOUND"));
        } catch (KeyNotFoundException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}

