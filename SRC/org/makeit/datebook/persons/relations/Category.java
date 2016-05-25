package org.makeit.datebook.persons.relations;

public abstract class Category {
    private String reference;

    public abstract String getCategory();

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }
}