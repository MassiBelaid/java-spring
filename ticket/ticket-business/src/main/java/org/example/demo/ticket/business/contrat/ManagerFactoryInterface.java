package org.example.demo.ticket.business.contrat;

import org.example.demo.ticket.business.contrat.manager.ProjetManagerInterface;
import org.example.demo.ticket.business.contrat.manager.TicketManagerInterface;

public interface ManagerFactoryInterface {

	void setTicketManager(TicketManagerInterface ticketManager);

	TicketManagerInterface getTicketManager();

	void setProjetManager(ProjetManagerInterface projetManager);

	ProjetManagerInterface getProjetManager();


	
}
