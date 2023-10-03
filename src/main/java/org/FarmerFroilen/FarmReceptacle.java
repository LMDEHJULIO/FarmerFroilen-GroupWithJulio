package org.FarmerFroilen;

import java.util.ArrayList;
import java.util.Optional;

public abstract class FarmReceptacle<T> {
    private int maxSize;
    private Class<T> storageType; // class type that will be stored - e.g. Person, Animal etc

    public FarmReceptacle(int maxSize, Class<T> storageType){
        this.maxSize = maxSize;
        this.storageType = storageType;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public Class<T> getStorageType() {
        return storageType;
    }

    public void setStorageType(Class<T> tClass){
        storageType = tClass;
    }
}
