package com.test

import com.models.City
import com.models.State
import com.service.CityService
import com.service.StateService
import io.vertx.core.json.Json
import io.vertx.core.json.JsonArray
import org.jboss.logging.annotations.Field
import org.jboss.resteasy.annotations.Body
import javax.enterprise.inject.Default
import javax.inject.Inject
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/")
class ExampleResource {

    @Inject
    @field: Default
    lateinit var cityService: CityService
    @Inject
    @field: Default
    lateinit var stateService: StateService

    @GET()
    @Produces(MediaType.TEXT_PLAIN)
    @Path("cities")
    fun getAllCities(): List<City> {
        return cityService.getAll();
    }

    @GET()
    @Produces(MediaType.TEXT_PLAIN)
    @Path("states")
    fun getAllStates(): List<State> {
        return stateService.getAll();
    }

    @POST()
    @Path("addCity")
    @Consumes(MediaType.APPLICATION_JSON)
    fun addCity(city : City) {
        return cityService.addCity(city);
    }

    @POST()
    @Path("addState")
    @Consumes(MediaType.APPLICATION_JSON)
    fun addCity(state : State) {
        return stateService.addState(state);
    }
}