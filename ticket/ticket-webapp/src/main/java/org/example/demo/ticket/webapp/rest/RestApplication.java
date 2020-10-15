package org.example.demo.ticket.webapp.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;


// Classe de configuration de l'application REST

@ApplicationPath("/")
public class RestApplication extends ResourceConfig {

    //Configuration et initialisation du framework
    public RestApplication() {
        packages("org.example.demo.ticket.webapp.rest");
    }
}
