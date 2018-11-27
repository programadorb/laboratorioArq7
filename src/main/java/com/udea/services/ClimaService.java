package com.udea.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;
import com.udea.model.Clima;


@Path("/clima")
@Stateless
@LocalBean
public class ClimaService {

    @EJB
    ClimaEJB ejb;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getAll(@PathParam("id") Long id) {
        System.out.println("el param que le llega es : "+id);
        return Response.ok().entity(new Gson().toJson(ejb.getById(id))).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getAll() {
        JsonArray result = (JsonArray) new Gson().toJsonTree(ejb.getAll(),new TypeToken<List<Clima>>() {}.getType());
        return Response.ok().entity(result.toString()).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response registrarClima(Clima clima)  {
        ejb.registrarClima(clima);
        return Response.ok().entity("ok").build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response actualizarClima(Clima clima) {
        ejb.actualizarClima(clima);
        return Response.ok().entity("ok").build();
    }
}