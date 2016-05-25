package org.makeit.datebook.persons.relations;

public class Coworker extends Group {
    private String place;
    private String profession;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public Categories getDescription() {
        return Categories.Colega;
    }
}
