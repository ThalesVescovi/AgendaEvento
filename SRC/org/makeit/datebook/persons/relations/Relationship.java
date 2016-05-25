package org.makeit.datebook.persons.relations;

public class Relationship {
    private Group group;
    private Proximity proximity;

    public enum Proximity {
        Intimo, Proximo, Regular, Distante, Incompativel
    }

    public Relationship(Group c, Proximity p) {
        group = c;
        proximity = p;
    }

    public Group getGroup() {
        return group;
    }
}
