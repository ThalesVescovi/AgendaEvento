package org.makeit.datebook.persons.relations;

public class Relationship {
    private Category category;
    private Proximity proximity;

    public Relationship(Category c, Proximity p) {
        category = c;
        proximity = p;
    }
}
