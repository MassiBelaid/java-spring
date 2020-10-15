package org.example.demo.ticket.webapp.rest.resource.projet;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.example.demo.ticket.business.contrat.manager.ProjetManagerInterface;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.webapp.rest.resource.AbstractRessource;


//Ressource REST

@Path("/projets")
@Produces(MediaType.APPLICATION_JSON)
public class ProjetResource extends AbstractRessource{

	
	
    //Renvoie le projet avec ID
    @GET
    @Path("{id}")
    public Projet get(@PathParam("id") Integer pId) throws NotFoundException {
        ProjetManagerInterface vProjetManager = getManagerFactory().getProjetManager();
        Projet vProjet = vProjetManager.getProjet(pId);
        return vProjet;
    }


    //Renvoie la liste des projets
    @GET
    public List<Projet> get() {
    	ProjetManagerInterface vProjetManager = getManagerFactory().getProjetManager();
        List<Projet> vListProjet = vProjetManager.getListProjet();
        return vListProjet;
    }
}
