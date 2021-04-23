package com.mytests.spring.componentScanFilters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * *
 * <p>Created by irina on 14.04.2021.</p>
 * <p>Project: componentscan-filters</p>
 * *
 */
public class RunMe {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("*******************************");
        for (String el : ctx.getBeanDefinitionNames()) {
            System.out.println("element = " + el);
        }
        System.out.println("*******************************");
    }

}