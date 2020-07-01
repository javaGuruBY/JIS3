package com.javaguru.shoppinglist;

import com.javaguru.shoppinglist.console.ConsoleUI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.javaguru.shoppinglist")
@Configuration
class ShoppingListApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ShoppingListApplication.class);
        context.getBean("consoleUI", ConsoleUI.class).execute();
    }
}
