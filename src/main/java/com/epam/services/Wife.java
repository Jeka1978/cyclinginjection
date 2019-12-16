package com.epam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class Wife {
    @Autowired
    private Husband husband;

    @PostConstruct
    public void init(){
        System.out.println("Wife created");
        System.out.print("I'm married to ");
        System.out.println(husband.getClass());
    }
}
