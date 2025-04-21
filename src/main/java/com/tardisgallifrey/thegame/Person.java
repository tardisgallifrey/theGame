package com.tardisgallifrey.thegame;

import java.util.ArrayList;

public class Person {

    private String name;
    private int classtype;
    private String species;
    private int armorClass;
    private int hitPoints;
    private Dice hitDice;
    private Attributes attributes;
   
    public String getName()
    {
        return this.name;
    }

    public Person(String name, int[] attributes)
    {
        this.name = name;
        this.attributes = new Attributes(attributes[0], attributes[1], attributes[2], attributes[3], attributes[4], attributes[5]);
    }


}
