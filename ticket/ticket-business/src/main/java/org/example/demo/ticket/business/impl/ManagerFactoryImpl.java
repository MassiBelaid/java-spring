package org.example.demo.ticket.business.impl;

import org.example.demo.ticket.business.contrat.ManagerFactoryInterface;
import org.example.demo.ticket.business.contrat.manager.ProjetManagerInterface;
import org.example.demo.ticket.business.contrat.manager.TicketManagerInterface;

public class ManagerFactoryImpl implements ManagerFactoryInterface{


	private ProjetManagerInterface projetManager;
	private TicketManagerInterface ticketManager;
	
	@Override
	public ProjetManagerInterface getProjetManager() {
		return projetManager;
	}
	@Override
	public void setProjetManager(ProjetManagerInterface projetManager) {
		this.projetManager = projetManager;
	}
	@Override
	public TicketManagerInterface getTicketManager() {
		return ticketManager;
	}
	@Override
	public void setTicketManager(TicketManagerInterface ticketManager) {
		this.ticketManager = ticketManager;
	}
}
