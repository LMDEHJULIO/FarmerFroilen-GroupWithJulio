package org.FarmerFroilen;

import java.util.ArrayList;
import java.util.Optional;

public abstract class FarmReceptacle<T> {
    int maxSize;
    Optional<Class<T>> storageType; // class type that will be stored - e.g. Person, Animal etc

    public FarmReceptacle(int maxSize, Optional<Class<T>> storageType){
        this.maxSize = maxSize;
        this.storageType = storageType;
    }

}
