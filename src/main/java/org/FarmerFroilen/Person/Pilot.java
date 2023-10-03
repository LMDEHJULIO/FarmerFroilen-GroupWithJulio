package org.FarmerFroilen.Person;

import lombok.Data;
import org.FarmerFroilen.Vehicle.Aircraft;
import org.FarmerFroilen.Interface.Edible;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pilot")
@Data
public class Pilot extends Person {
    public Pilot(String name) {
        super(name);
    }
    public void Flies(Aircraft aircraft){

        System.out.println("I can't fly yet");
    }

    @Override
    public void eat(Edible edible) {
       if(edible == null){
           System.out.println("I can't eat air -pilot");
       }

        System.out.println("EATING...");
    }

    @Override
    public void makeNoise() {
        System.out.println("I can fly");
    }

    public boolean getOn(Aircraft aircraft){
        if(aircraft.isFlying() || aircraft.hasPilot() == true){
            return false;
        }
        return true;
    }

    public boolean getOff(Aircraft aircraft){
        if( aircraft.hasPilot() == true && aircraft.isFlying() == false){
            return true;
        }
        return false;
    }


}
