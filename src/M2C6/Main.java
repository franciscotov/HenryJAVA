package M2C6;

import M2C6.classes.Utilities;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Number> elements = new ArrayList<>();
        List<Number> destination = new ArrayList<>();
        Utilities utilities = new Utilities();

        elements.add(1);
        elements.add(2);
        elements.add(1.2);

        utilities.printElements(elements);
        utilities.copyElements(elements, destination);
        System.out.println(destination);

        // If destination list is not the same or super class of type elements
        // copyElements givesa back an error
        // reason: no instance(s) of type variable(s) exist so that Number conforms to Integer
        List<Integer> destinationTwo = new ArrayList<>();
//         utilities.copyElements(elements, destinationTwo);
    }
}
