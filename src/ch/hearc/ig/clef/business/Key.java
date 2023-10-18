package ch.hearc.ig.clef.business;

public class Key {
    private String keyValue;
    private String description;

    public Key(String keyValue, String description) {
        this.keyValue = keyValue;
        this.description = description;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public String getDescription() {
        return description;
    }
}
