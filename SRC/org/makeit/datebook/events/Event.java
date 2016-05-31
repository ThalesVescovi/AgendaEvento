package org.makeit.datebook.events;

import org.makeit.datebook.persons.Contact;
import org.makeit.datebook.persons.Like;

import java.util.ArrayList;

public class Event {
    private String description;
    private String name;
    private ArrayList<Like> likes;
    private ArrayList<Contact> contacts;

    public void addPreference(Like p) {
        if (!likes.contains(p)) {
            likes.add(p);
        }
    }

    public void removePreference(Like p) {
        if (likes.contains(p)) {
            likes.add(p);
        }
    }

    public void addContact(Contact c) {
        if (!contacts.contains(c)) {
            contacts.add(c);
        }
    }

    public void removeContact(Contact c) {
        if (contacts.contains(c)) {
            contacts.remove(c);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
