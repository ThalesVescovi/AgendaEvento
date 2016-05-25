package org.makeit.datebook.persons.relations;

public class Relationship {

    public enum Proximity {
        Intimo, Proximo, Regular, Distante, Incompativel
    }

    private Category category;
    private Proximity proximity;

    public Relationship(Category c, Proximity p) {
        category = c;
        proximity = p;
    }
}
