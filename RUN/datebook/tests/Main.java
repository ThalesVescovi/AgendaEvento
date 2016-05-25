package datebook.tests;

import org.makeit.datebook.persons.relations.Family;

public class Main {

    public static void main(String[] args) {
        Family f = new Family();
        f.setReference("Um primo random");

        System.out.println(
                f.getDescription() + "\n" +
                        f.getReference()
        );
    }
}
