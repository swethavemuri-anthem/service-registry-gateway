/**
 * 
 */
package com.atlas.petclinic;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author AC63348
 *
 */
@Component
public class ApplicationBeanResolver implements ApplicationContextAware{
	
		static ApplicationContext appContext;

		@Override
		public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
			appContext = applicationContext;
		}
		
		public static <R> R getBean(Class<R> clazz) {
			return appContext.getBean(clazz);
		}
}