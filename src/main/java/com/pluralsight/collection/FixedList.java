package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    List<T> items;
    int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void add(T item){
        if(items.size() > maxSize){
            int size = items.size() - maxSize;
            throw new IllegalStateException("The list is full. The max size for this list is" + maxSize + "Exceed by" + size );
        } else {
            items.add(item);
        }
    }

    public List<T> getItems(){
        return items;
    }

    @Override
    public String toString() {
        return "FixedList{" +
                "items=" + items +
                ", maxSize=" + maxSize +
                '}';
    }
}
