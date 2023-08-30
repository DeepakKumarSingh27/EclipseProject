package org.jsp.Springdemo2Nsir;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    
	ApplicationContext 	factory = new AnnotationConfigApplicationContext(AppConfig.class);
    Samsung s7 = factory.getBean(Samsung.class);
    s7.config();
   
    
    }
}

/*
Samsung s7 = new Samsung();
s7.config();
*/