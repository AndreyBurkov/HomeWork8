package com.netcracker;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

public class MathClient {

    private static String URL = "http://localhost:8080/rest/calc";

    public static void main(String[] args) {

        Double a = 569.5;
        Double b = 132.2;

        Client client = ClientBuilder.newClient( new ClientConfig().register( LoggingFilter.class ) );
        WebTarget webTarget = client.target(URL).path("add").path(a.toString()).path(b.toString());
        Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.get();
        Double add = response.readEntity(Double.class);
        System.out.println(a + " + " + b + " = " + add);

        webTarget = client.target(URL).path("sub").path(a.toString()).path(b.toString());
        invocationBuilder =  webTarget.request(MediaType.TEXT_PLAIN);
        response = invocationBuilder.get();
        Double sub = response.readEntity(Double.class);
        System.out.println(a + " - " + b + " = " + sub);

        webTarget = client.target(URL).path("mul").path(a.toString()).path(b.toString());
        invocationBuilder =  webTarget.request(MediaType.TEXT_HTML);
        response = invocationBuilder.get();
        String mul = response.readEntity(String.class);
        System.out.println(a + "*" + b + " = " + mul);

        webTarget = client.target(URL).path("div").path(a.toString()).path(b.toString());
        invocationBuilder =  webTarget.request(MediaType.TEXT_XML);
        response = invocationBuilder.get();
        String div = response.readEntity(String.class);
        System.out.println(a + "/" + b + " = " + div);
    }
}

