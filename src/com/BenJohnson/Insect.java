package com.BenJohnson;

public abstract class Insect
{
    // The variables common to all insects - name, number of legs, and number of wings.
    private String name;
    private int numWings;
    public final int numLegs = 6;

    public Insect(String name, int numWings)
    {
        // Basic constructor.
        this.name = name;
        this.numWings = numWings;
    }

    // Getters and setters.
    public void setName(String newName)
    {
        this.name = newName;
    }

    public String getName()
    {
        return this.name;
    }

    public void setNumWingsings(int newNumWings)
    {
        this.numWings = newNumWings;
    }

    public int getNumWings()
    {
        return this.numWings;
    }

    // Declare the print method - will be unique to each subclass.
    public abstract String printSpeciesData();
}

class Butterfly extends Insect
{
    // Variables for butterflies.
    private String wingColor;
    private String favoriteFlower;

    public Butterfly(String name, int numWings, String wingColor, String favoriteFlower)
    {
        // Constructor - call Insect's constructor and set butterfly's unique variables.
        super(name, numWings);
        this.wingColor = wingColor;
        this.favoriteFlower = favoriteFlower;
    }

    // Getters and setters.
    public void setWingColor(String newColor)
    {
        this.wingColor = newColor;
    }

    public String getWingColor()
    {
        return this.wingColor;
    }

    public void setFavoriteFlower(String newFavoriteFlower)
    {
        this.favoriteFlower = newFavoriteFlower;
    }

    public String getFavoriteFlower()
    {
        return this.favoriteFlower;
    }

    // The print method - chose to make it more like a toString kind of thing - returns string instead of printing.
    public String printSpeciesData()
    {
        return "Name: " + this.getName() + "\nNumber of wings: " + this.getNumWings() + "\nWing color: " +
                this.wingColor + "\nFavorite flower: " + this.favoriteFlower;
    }
}

class Bee extends Insect
{
    // Bee variables.
    private String bodyColor;
    private boolean makesHoney;
    private String favoriteFlower;

    public Bee(String name, int numWings, String bodyColor, boolean makesHoney, String favoriteFlower)
    {
        // Call Insect's constructor, set bee things.
        super(name, numWings);
        this.bodyColor = bodyColor;
        this.makesHoney = makesHoney;
        this.favoriteFlower = favoriteFlower;
    }

    // Getters as well as setters.
    public void setBodyColor(String newColor)
    {
        this.bodyColor = newColor;
    }

    public String getBodyColor()
    {
        return this.bodyColor;
    }

    public void setMakesHoney(boolean makesHoney)
    {
        this.makesHoney = makesHoney;
    }

    public boolean getMakesHoney()
    {
        return this.makesHoney;
    }

    public void setFavoriteFlower(String newFavorite)
    {
        this.favoriteFlower = newFavorite;
    }

    public String getFavoriteFlower()
    {
        return this.favoriteFlower;
    }

    // Get the data string. Simple if/else to make boolean variable more printable.
    public String printSpeciesData()
    {
        String honey;
        if (this.makesHoney) { honey = "Yes"; }
        else { honey = "No"; }
        return "Name: " + this.getName() + "\nNumber of wings: " + this.getNumWings() + "\nBody color: " +
                this.bodyColor + "\nMakes honey: " + honey + "\nFavorite flower: " + this.favoriteFlower;
    }
}