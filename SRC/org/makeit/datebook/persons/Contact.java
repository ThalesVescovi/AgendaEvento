package org.makeit.datebook.persons;

import org.makeit.datebook.persons.relations.Relationship;

import java.util.ArrayList;

public class Contact {

    public enum Genre {
        Feminino, Masculino
    }

    private ArrayList<Relationship> relationships;
    private ArrayList<Like> likes;
    private Genre genre;
    private String name;


    public void addRelationship(Relationship relationship) {
        if (!relationships.contains(relationship)) {
            relationships.add(relationship);
        }
    }

    public void removeRelationship(Relationship relationship) {
        if (relationships.contains(relationship)) {
            relationships.remove(relationship);
        }
    }
}
