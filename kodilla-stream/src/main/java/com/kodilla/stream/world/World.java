package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class World {

    private final Set<Country> population = new HashSet<>();

    private final List<Continent> continentList = new ArrayList<>();

    //metoda zwróci sumę ludności wszystkich krajów
    public BigDecimal getPeopleQuantity() {
        return population.stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}