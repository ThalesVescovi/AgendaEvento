package org.makeit.datebook.model;

public class Relationship {
    private Category category;
    private Proximity proximity;

    public Relationship(Category c, Proximity p) {
        category = c;
        proximity = p;
    }
}
