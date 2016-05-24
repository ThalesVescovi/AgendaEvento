package org.makeit.datebook.persons;

import org.makeit.datebook.persons.relations.Relationship;

import java.util.ArrayList;

public abstract class Contact {
    private ArrayList<Relationship> relationships;
    private ArrayList<Preference> preferences;
    private Genre genre;
}
