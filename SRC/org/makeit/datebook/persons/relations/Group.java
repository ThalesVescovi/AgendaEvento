package org.makeit.datebook.persons.relations;

public abstract class Group {
    private String reference;

    public enum Categories {
        Familia, Amigo, Colega
    }

    public abstract Categories getDescription();

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }
}