package org.FarmerFroilen;

import jdk.jshell.execution.Util;

import java.util.List;
import java.util.Optional;

public class FarmHouse extends FarmReceptacle {

    private Utility.MaxableArrayList<Farmer> farmHands;

     public FarmHouse(){
         super(5, Optional.of(Person.class));
         this.farmHands = new Utility.MaxableArrayList<Farmer>(this.maxSize);
     }

}
