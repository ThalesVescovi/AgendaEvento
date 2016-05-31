package org.makeit.datebook.persons.relations;

public class Relationship {
    private Proximity proximity;
    private int indiceContato;

    public enum Proximity {
        Intimo, Proximo, Regular, Distante, Incompativel
    }
}
