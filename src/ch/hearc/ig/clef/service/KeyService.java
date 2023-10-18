package ch.hearc.ig.clef.service;

import ch.hearc.ig.clef.business.Key;
import ch.hearc.ig.clef.business.KeyNotFoundException;

public interface KeyService {
    void addKey(String keyValue, String description);
    String getKeyDescription(String keyValue) throws KeyNotFoundException;
    void deleteKey(String keyValue) throws KeyNotFoundException;
}

