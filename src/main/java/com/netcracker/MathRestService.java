package com.netcracker;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/calc")
public class MathRestService {
    // -------------------- Addition -----------------------------------------------------------------
    @GET
    @Path("/add/{a}/{b}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response addJSON(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a + b;
        return Response.status(200).entity(result).build();
    }

    @GET
    @Path("/add/{a}/{b}")
    @Produces(value = MediaType.TEXT_PLAIN)
    public String addTextPlain(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a + b;
        return result.toString();
    }

    @GET
    @Path("/add/{a}/{b}")
    @Produces(value = MediaType.TEXT_HTML)
    public String addTextHTML(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a + b;
        return "<html><head> " + "<title>" + "Math" + "</title></head>"
                + "<body><h1>" + a + " + " + b + " = " + result + "</h1></body>" + "</html> ";
    }

    @GET
    @Path("/add/{a}/{b}")
    @Produces(value = MediaType.TEXT_XML)
    public String addTextXML(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a + b;
        return "<?xml version=\"1.0\"?>" + "<result>" + a + " + " + b + " = " + result + "</result>";
    }
    // -------------------- Subtraction --------------------------------------------------------------
    @GET
    @Path("/sub/{a}/{b}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response subJSON(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a - b;
        return Response.status(200).entity(result).build();
    }

    @GET
    @Path("/sub/{a}/{b}")
    @Produces(value = MediaType.TEXT_PLAIN)
    public String subTextPlain(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a - b;
        return result.toString();
    }

    @GET
    @Path("/sub/{a}/{b}")
    @Produces(value = MediaType.TEXT_HTML)
    public String subTextHTML(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a - b;
        return "<html><head> " + "<title>" + "Math" + "</title></head>"
                + "<body><h1>" + a + " - " + b + " = " + result + "</h1></body>" + "</html> ";
    }

    @GET
    @Path("/sub/{a}/{b}")
    @Produces(value = MediaType.TEXT_XML)
    public String subTextXML(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a - b;
        return "<?xml version=\"1.0\"?>" + "<result>" + a + " - " + b + " = " + result + "</result>";
    }
    // -------------------- Multiplication -----------------------------------------------------------
    @GET
    @Path("/mul/{a}/{b}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response mulJSON(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a*b;
        return Response.status(200).entity(result).build();
    }

    @GET
    @Path("/mul/{a}/{b}")
    @Produces(value = MediaType.TEXT_PLAIN)
    public String mulTextPlain(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a*b;
        return result.toString();
    }

    @GET
    @Path("/mul/{a}/{b}")
    @Produces(value = MediaType.TEXT_HTML)
    public String mulTextHTML(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a*b;
        return "<html><head> " + "<title>" + "Math" + "</title></head>"
                + "<body><h1>" + a + "*" + b + " = " + result + "</h1></body>" + "</html> ";
    }

    @GET
    @Path("/mul/{a}/{b}")
    @Produces(value = MediaType.TEXT_XML)
    public String mulTextXML(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a*b;
        return "<?xml version=\"1.0\"?>" + "<result>" + a + "*" + b + " = " + result + "</result>";
    }
    // -------------------- Division -----------------------------------------------------------------
    @GET
    @Path("/div/{a}/{b}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response divJSON(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a/b;
        return Response.status(200).entity(result).build();
    }

    @GET
    @Path("/div/{a}/{b}")
    @Produces(value = MediaType.TEXT_PLAIN)
    public String divTextPlain(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a/b;
        return result.toString();
    }

    @GET
    @Path("/div/{a}/{b}")
    @Produces(value = MediaType.TEXT_HTML)
    public String divTextHTML(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a/b;
        return "<html><head> " + "<title>" + "Math" + "</title></head>"
                + "<body><h1>" + a + "/" + b + " = " + result + "</h1></body>" + "</html> ";
    }

    @GET
    @Path("/div/{a}/{b}")
    @Produces(value = MediaType.TEXT_XML)
    public String divTextXML(@PathParam("a") Double a, @PathParam("b") Double b) {
        Double result = a/b;
        return "<?xml version=\"1.0\"?>" + "<result>" + a + "/" + b + " = " + result + "</result>";
    }

}
