package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext con = new AnnotationConfigApplicationContext(Configurationfile.class);
        Shopping shop = con.getBean(Shopping.class);
        shop.ShopCheck("Checking");
        shop.check();

    }
}
