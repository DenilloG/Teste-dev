package com.service

import com.models.City
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class CityService {
    private var cities = ArrayList<City>();

    public fun getAll(): List<City> {
        return cities;
    }

    fun addCity(city: City) {
        cities.add(city);
    }

    fun removeCity(id: Int) {
        cities.removeIf { x -> x.id == id };
    }

    fun getCityByName(name: String): City? {
       return cities.find { city -> city.name == name }
    }

    fun getCityByCode(id: Int): City? {
        return cities.find { city -> city.id == id }
    }
}