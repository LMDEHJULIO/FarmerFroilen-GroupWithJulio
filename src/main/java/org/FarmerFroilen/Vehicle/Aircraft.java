package org.FarmerFroilen.Vehicle;

public abstract class Aircraft extends Vehicle {
    private boolean isFlying = false;

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


    public void takeOff(){
    setFlying(true);
        System.out.println("The aircraft is taking off.");
    }
    public void land(){
    setFlying(false);
        System.out.println("The aircraft is landing");
    }
    public void fly(){
        takeOff();
    if(isFlying){
        System.out.println("The aircraft is currently flying.");
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
