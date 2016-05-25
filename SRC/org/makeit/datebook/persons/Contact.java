package org.makeit.datebook.persons;

import org.makeit.datebook.persons.relations.Group.Categories;
import org.makeit.datebook.persons.relations.Relationship;

import java.util.ArrayList;

public class Contact {

    public enum Genre {
        Feminino, Masculino
    }

    private ArrayList<Relationship> relationships;
    private ArrayList<Preference> preferences;
    private Genre genre;

    public boolean isMemberOf(Categories c) {
        for (Relationship r : relationships) {
            if (r.getGroup().getDescription() == c) {
                return true;
            }
        }

        return false;
    }

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
