package com.dyzwj.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletContainerConfig {

//	@Bean
	public WebServerFactoryCustomizer customizer(){
		WebServerFactoryCustomizer<TomcatServletWebServerFactory> customizer = factory -> {
//			factory.setPort();
		};
		return customizer;
//		return factory -> {
//			TomcatServletWebServerFactory servletWebServerFactory = (TomcatServletWebServerFactory) factory;
//		} ;
	}


//	@Bean
	public TomcatServletWebServerFactory servletWebServerFactory(){
		TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
//		factory.setPort();
		return factory;
	}

}
