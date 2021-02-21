package com.time.tracker.web;

import com.time.tracker.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class StartController {

    @Autowired
    private CustomerService customerService;

    @GetMapping( "/" )
    public String start( Model model ) {
        var customers = customerService.listCustomers();
        log.info("Executing start Spring Controller");
        model.addAttribute("customers", customers);
        return "index";
    }

    //@GetMapping()
}
