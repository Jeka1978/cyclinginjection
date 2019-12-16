package com.epam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
@DependsOn("wife")
public class Husband {
    private Wife wife;

    @Autowired
    public Husband(Wife wife) {
        this.wife = wife;
    }

    @PostConstruct
    public void init(){
        System.out.println("Husband created");
        System.out.print("I'm married to ");
        System.out.println(wife.getClass());
    }

}
