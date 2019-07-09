/**
 * 
 */
package com.springbootmicroservicesexample.configuration;

import org.jboss.logging.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.springbootmicroservicesexample.interceptor.DemoInterceptor;

/**
 * @author Emmanuel Raj
 * spring configuration in spring mvc  bean configuration equivalent
 */
@Configuration
public class DemoInterceptorConfiguration implements WebMvcConfigurer
{
	
	private static final Logger logger = Logger.getLogger(DemoInterceptor.class);
	/**
	 * override this addInterceptors method
	 * register the interceptor class 
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) 
	{
		
		logger.info("bean addInterceptors configuration");
		 registry.addInterceptor(new DemoInterceptor()).addPathPatterns("/**"); //anything future url also will first go into this interceptor before after webpage

	}
	

}
