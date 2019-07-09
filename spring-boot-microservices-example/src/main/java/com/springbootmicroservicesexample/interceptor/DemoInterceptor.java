/**
 * 
 */
package com.springbootmicroservicesexample.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author Emmanuel Raj
 *  interceptor
 * 
 * if weekdays means application will work weekend it won't work 
 *  
 */
@Component
public class DemoInterceptor  implements HandlerInterceptor
{
	
	private static final Logger logger = Logger.getLogger(DemoInterceptor.class);
	
     public boolean preHandle(HttpServletRequest request,	HttpServletResponse response, Object handler) throws Exception 
		{
            logger.info("preHandle Method before controller request Mapping"); 	
            
            Calendar cal = Calendar.getInstance();
    		
    		int dayOfWeek = cal.get(cal.DAY_OF_WEEK); //getting the day which request is made
    		
    		
    		if(dayOfWeek ==4)  // 1 means sunday 2 means monday ...7 saturday
    		{
    			response.getWriter().write("Today website closed");
    			
    			return false;
    		}
    		else
    		{
    			return true;
    		}
			
		}
	
  
  
	

}
