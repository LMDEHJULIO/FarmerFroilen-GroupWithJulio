package org.FarmerFroilen.Crop;

import org.FarmerFroilen.Interface.Edible;

public class Cornstalk extends Crop {

    public Cornstalk(){}
    public Cornstalk(boolean hasBeenFertilized) {
        super(hasBeenFertilized);
    }

    /**
     *
     * It'll return null which means it can't produce it if it already is harvested or hasn't been fertilized
     * @return Returns an EarCorn if it hasn't been harvested and it is fertilized
     */
    @Override
    public Edible yield(){
        if(getHasBeenFertilized()&&!getHasBeenHarvested()){
            System.out.println("This cornstalk has produced an EarCorn! ");
            setHasBeenHarvested(true);
            return new EarCorn();
        } else if (!getHasBeenFertilized()) {
            System.out.println("This cornstalk hasn't been fertilized!");
            return null;
        }else{
            System.out.println("This cornstalk has already been harvested!");
            return null;
        }
    }

    /**
     *
     * @return returns the status of the Cornstalk
     */
    @Override
    public String toString(){
        return "Am I fertilized? : " + getHasBeenFertilized()+ "\tHave I been harvested? : "+getHasBeenHarvested();
    }



}
