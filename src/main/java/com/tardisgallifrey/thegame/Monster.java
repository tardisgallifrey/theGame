package com.tardisgallifrey.thegame;

import java.util.ArrayList;

public class Monster extends Person {
    public Monster(){
        super();
        this.attributes = new ArrayList<Integer>();
        this.attributes.add(this.strength);
        this.attributes.add(this.dexterity);
        this.attributes.add(this.constitution);
        this.attributes.add(this.intelligence);
        this.attributes.add(this.wisdom);
        this.attributes.add(this.charisma);
    }
}
