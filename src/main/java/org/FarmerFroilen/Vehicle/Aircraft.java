package org.FarmerFroilen.Vehicle;

import org.FarmerFroilen.Person.Pilot;

public abstract class Aircraft extends Vehicle {
    private boolean isFlying = false;
    private Pilot pilot = null;

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public Aircraft(String name, String noise, boolean rideable) {
        super(name, noise, rideable);
    }
    // added this bc of a test error in FarmerTest

    public boolean hasPilot() {
        boolean piloted = false;
        if (pilot != null) {
            piloted = true;
        } else {
            System.out.println("The aircraft has no pilot");
        }
        return piloted;
    }
    public void takeOff(){
        hasPilot();
    setFlying(true);
        System.out.println("The aircraft is taking off.");
    }
    public void land(){
    hasPilot();
    setFlying(false);
        System.out.println("The aircraft is landing");
    }
    public void fly() {
        if(hasPilot()) {
            takeOff();
            if (isFlying) {
                System.out.println("The aircraft is currently flying.");
            }
        }
        }

    @Override
    public String toString() {
        return "Aircraft{" +
                "isFlying=" + isFlying +
                ", flying=" + isFlying() +
                ", operating=" + isOperating() +
                ", name='" + getName() + '\'' +
                ", noise='" + getNoise() + '\'' +
                ", isRideable=" + getIsRideable() +
                '}';
    }
}
