package com.time.tracker.web;

import com.time.tracker.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class ProjectController {
    
    @Autowired
    private ProjectService projectService;

    @GetMapping( "/projects" )
    public String start( Model model ) {
        var projects = projectService.listProjects();
        model.addAttribute("projects", projects);
        
        

        model.addAttribute("totalCustomers", projects.size());
        return "index";
    }
}
