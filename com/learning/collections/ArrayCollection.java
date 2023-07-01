package com.learning.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayCollection {
    public static void main(String[] args) {

        Product door = new Product("Wooden door", 35);
        Product floorPanel = new Product("Floor panel", 25);
        Product window = new Product("window", 10);

        //It is a Collection of Products.
        Collection<Product> products= new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        Iterator<Product> iterator = products.iterator();

        //If we use normal For each to remove the element while iterating the Collection it gives ConCurrentModificationException so we go with Iterator
        while (iterator.hasNext()){
            Product product = iterator.next();
            if(product.getWeight() > 20){
                iterator.remove();
            }
        }

        //This works while iterating a list and modifying at once
//        for (int i = 0; i < products.size(); i++) {
//            if(products.get(0).getWeight() > 20){
//                products.remove(0);
//            }
//        }

        for (Product product: products) {
            System.out.println(product);
        }
    }
}
