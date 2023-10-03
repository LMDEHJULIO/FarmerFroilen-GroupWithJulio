package org.FarmerFroilen.Utility;

import java.util.ArrayList;
import java.util.Collection;

public class Utility {
    public static class MaxableArrayList<T> extends ArrayList<T>{

        // Maxable ArrayList IS an ArrayList - it does not need a list property
        // private ArrayList<T> list;
        private int maxSize;

        public MaxableArrayList(int maxSize){
            this.maxSize = maxSize;
        }

        public int getMaxSize(){
            return maxSize;
        }

        public boolean throwIfMaxedOut(int addedSize){
            if(this.size() + addedSize > maxSize){

                throw new IndexOutOfBoundsException("Max size reached");

            }
            return false;
        }

        @Override
        public boolean add(T item){
            try {
                throwIfMaxedOut(1);
                super.add(item);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        @Override
        public void add(int index, T element){
            try {
                super.add(index, element);
                System.out.println("Added" + element + "at" + index);
            } catch (Exception e) {
                throwIfMaxedOut(1);
                e.printStackTrace();
            }
        }

        @Override

        public boolean addAll(Collection<? extends T> collection){
            try {
                throwIfMaxedOut(collection.size());
                super.addAll(collection);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        @Override
        public boolean remove(Object object){
            return super.remove(object);
        }
    }



}
