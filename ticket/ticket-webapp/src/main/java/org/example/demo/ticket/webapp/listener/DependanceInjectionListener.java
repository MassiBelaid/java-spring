package org.example.demo.ticket.webapp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.example.demo.ticket.business.contrat.ManagerFactoryInterface;
import org.example.demo.ticket.business.impl.ManagerFactoryImpl;
import org.example.demo.ticket.business.impl.manager.ProjetManagerImpl;
import org.example.demo.ticket.business.impl.manager.TicketManagerImpl;
import org.example.demo.ticket.webapp.rest.resource.AbstractRessource;

public class DependanceInjectionListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//Création de l'instance de ManagerFactory
		ManagerFactoryInterface vManagerFactory = new ManagerFactoryImpl();
		vManagerFactory.setProjetManager(new ProjetManagerImpl());
		vManagerFactory.setTicketManager(new TicketManagerImpl());
		AbstractRessource.setManagerFactory(vManagerFactory);
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
