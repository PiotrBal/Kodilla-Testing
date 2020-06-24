package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Collection Test Suite: Start");
    }
    @After
    public void after() {
        System.out.print("Collection Test Suite: End\n");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        //Then
        Assert.assertEquals(0, result.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        //muszę dać konkretne liczby, które później będę mógł sprawdzić w than
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(1);
        normalList.add(8);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(normalList);
        //Then
        ArrayList<Integer> checkList = new ArrayList<Integer>();
        checkList.add(2);
        checkList.add(4);
        checkList.add(8);
        Assert.assertEquals(checkList, result);
        }
}
