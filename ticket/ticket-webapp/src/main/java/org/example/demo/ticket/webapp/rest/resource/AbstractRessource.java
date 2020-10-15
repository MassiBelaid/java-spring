package org.example.demo.ticket.webapp.rest.resource;

import org.example.demo.ticket.business.contrat.ManagerFactoryInterface;

public abstract class AbstractRessource {

	private static ManagerFactoryInterface managerFactory;
	
	
	protected static ManagerFactoryInterface getManagerFactory() {
		return managerFactory;
	}
	
	public static void setManagerFactory(ManagerFactoryInterface pManagerFactory) {
		managerFactory = pManagerFactory;
	}
}
