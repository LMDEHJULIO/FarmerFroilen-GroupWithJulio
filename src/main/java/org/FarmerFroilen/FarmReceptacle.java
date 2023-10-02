package org.FarmerFroilen;

import java.util.ArrayList;
import java.util.Optional;

public abstract class FarmReceptacle<T> {
    private int maxSize;
    private Optional<Class<T>> storageType; // class type that will be stored - e.g. Person, Animal etc

    public FarmReceptacle(int maxSize, Optional<Class<T>> storageType){
        this.maxSize = maxSize;
        this.storageType = storageType;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public Optional<Class<T>> getStorageType() {
        return storageType;
    }

    public void setStorageType(Optional<Class<T>> tClass){
        storageType = tClass;
    }
}
