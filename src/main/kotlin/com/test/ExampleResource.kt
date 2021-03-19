package com.test

import com.models.City
import com.service.CityService
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
    lateinit var service: CityService

    @GET()
    @Produces(MediaType.TEXT_PLAIN)
    @Path("cities")
    fun getAllCities(): List<City> {
        return service.getAll();
    }

    @POST()
    @Path("addCity")
    @Consumes(MediaType.APPLICATION_JSON)
    fun addCity(city : City) {
        return service.addCity(city);
    }
}