package br.com.hannelu.data;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.InputStream;
import javax.servlet.annotation.WebListener;
import java.util.logging.Logger;
import javax.inject.Inject;

@WebListener
public class ImageInitializer implements ServletContainerInitializer,ServletContextListener{
	@Inject Logger log;

	public void onStartup(java.util.Set<java.lang.Class<?>> c, ServletContext ctx) {
		InputStream r = ImageInitializer.class.getClassLoader().getResourceAsStream("repository");
		if(r == null) {

		}	

	}
	public void contextInitialized(ServletContextEvent sce){ /*no implementation*/ }
	public void contextDestroyed(ServletContextEvent sce) {

	}
}
