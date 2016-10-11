package com.BenJohnson;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args)
    {
        // A list for all the insects.
        LinkedList<Insect> insects = new LinkedList<>();

        // Create two butterflies, add them to the list.
        Butterfly monarch = new Butterfly("Monarch", 4, "Orange and Black", "Milkweed");
        Butterfly commonYellowSwallowtail = new Butterfly("Common Yellow Swallowtail", 4,
                                                          "Yellow and Black", "Milk Parsley");
        insects.add(monarch);
        insects.add(commonYellowSwallowtail);

        // Create two bees, add them to the list.
        Bee honeyBee = new Bee("Honey Bee", 4, "Yellow and Black", true, "Jasmine");
        Bee bumbleBee = new Bee("Bumble Bee", 4, "Yellow, Black and White", false, "Clover");
        insects.add(honeyBee);
        insects.add(bumbleBee);

        // Printing the data, one by one.
        System.out.println(monarch.printSpeciesData());
        System.out.println(commonYellowSwallowtail.printSpeciesData());
        System.out.println(honeyBee.printSpeciesData());
        System.out.println(bumbleBee.printSpeciesData());

        // Printing the data with a foreach loop.
        for (Insect i : insects)
        {
            System.out.println(i.printSpeciesData());
        }
    }
}
