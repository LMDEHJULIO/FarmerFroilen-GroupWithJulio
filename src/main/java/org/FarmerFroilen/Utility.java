package org.FarmerFroilen;

import java.util.ArrayList;
import java.util.Optional;

public class Utility {
    public static class MaxableArrayList<T>{
        private ArrayList<T> list;
        private int maxSize;

        public MaxableArrayList(int maxSize){
            this.list = new ArrayList<>();
            this.maxSize = maxSize;
        }

        public void throwIfMaxedOut(){
            if(this.list.size() == maxSize){
                throw new IndexOutOfBoundsException("Max size reached");
            }
        }

        public boolean add(T item){
            try {
                throwIfMaxedOut();
                list.add(item);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

}
