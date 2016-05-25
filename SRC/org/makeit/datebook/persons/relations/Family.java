package org.makeit.datebook.persons.relations;

/**
 * Created by 20132BSI0168 on 24/05/2016.
 */
public class Family extends Group {
    private String connection;

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public Categories getDescription() {
        return Categories.Familia;
    }
}