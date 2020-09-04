package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<World> worldList = new ArrayList<>();
        worldList.add(new World());
        worldList.add(new World());
        worldList.add(new World());

        //When
        BigDecimal population = BigDecimal.ZERO;
        for(World world : worldList) {
            population = population.add(world.getPeopleQuantity());
        }

        //Then
        BigDecimal expectedPopulation = new BigDecimal(0);
        Assert.assertEquals(expectedPopulation, population);
    }
}
