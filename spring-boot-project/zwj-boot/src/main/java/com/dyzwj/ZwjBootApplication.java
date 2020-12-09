package com.dyzwj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * spring ioc在初始化Configuration时有个顺序，会选取一个根Configuration最先加载，然后再去加载其他的Configuration
 */
@SpringBootApplication
public class ZwjBootApplication extends SpringBootServletInitializer {


	//jar包启动
	public static void main(String[] args) {
		SpringApplication.run(ZwjBootApplication.class,args);
	}

	/**
	 * 外部tomcat启动  war包
	 * @param builder a builder for the application context
	 * @return
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return super.configure(builder).sources(ZwjBootApplication.class);
	}


}
