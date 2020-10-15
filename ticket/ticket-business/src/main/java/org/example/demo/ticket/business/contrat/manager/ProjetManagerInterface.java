package org.example.demo.ticket.business.contrat.manager;

import java.util.List;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;

public interface ProjetManagerInterface {

	List<Projet> getListProjet();

	Projet getProjet(Integer pId) throws NotFoundException;

}
