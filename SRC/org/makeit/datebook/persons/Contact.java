package org.makeit.datebook.persons;

import org.makeit.datebook.persons.relations.Relationship;

import java.util.ArrayList;

public abstract class Contact {

    public enum Genre {
        Feminino, Masculino
    }

    private ArrayList<Relationship> relationships;
    private ArrayList<Preference> preferences;
    private Genre genre;
}
