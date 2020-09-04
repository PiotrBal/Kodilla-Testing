package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public final class Country {
    private final String name;
    private final int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return population == country.population &&
                Objects.equals(name, country.name);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = BigDecimal.valueOf(getPopulation());
        return peopleQuantity;
    }
}
