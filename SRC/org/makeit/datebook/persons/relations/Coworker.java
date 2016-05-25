package org.makeit.datebook.persons.relations;

/**
 * Created by 20132BSI0168 on 24/05/2016.
 */
public class Coworker extends Category {
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
    public String getCategory() {
        return "Coworker";
    }
}
