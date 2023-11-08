package com.halimah.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String args[]){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("cart");
        System.out.println(shoppingCart);



    }
}


