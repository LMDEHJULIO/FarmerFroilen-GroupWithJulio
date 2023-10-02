package org.FarmerFroilen;

import java.util.ArrayList;
import java.util.Optional;

public class Utility {
    public static class MaxableArrayList<T> extends ArrayList<T>{

        // Maxable ArrayList IS an ArrayList - it does not need a list property
        //        private ArrayList<T> list;
        private int maxSize;

        public MaxableArrayList(int maxSize){
            this.maxSize = maxSize;
        }

        public void throwIfMaxedOut(){
            if(this.size() == maxSize){
                throw new IndexOutOfBoundsException("Max size reached");
            }
        }

        @Override
        public boolean add(T item){
            try {
                throwIfMaxedOut();
                super.add(item);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

}
