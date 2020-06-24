package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList <Integer> oddCollection = new ArrayList<Integer>();
        Integer temporaryValue = 0;
        for (Integer number : numbers) {
            temporaryValue = number;
            if (temporaryValue % 2 == 0) {
                oddCollection.add(temporaryValue);
            }
        }
        return oddCollection;
    }
}
