package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    
    @RequestMapping("/home")
    public String home(Model model){ 
        System.out.println("Home Page Handler");
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("youtubeChannel", "Learn Code with durgesh");
        return "home";
    }
    // about route
    @RequestMapping("/about")
    public String aboutPage(Model model){
        //model.addAttribute("isLogin", true);
        System.out.println("About Page Loading");
        return "about";
    }

    //services 
    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("Services Page Loading");
        return "services";
    }
    

    //contact Page
    @GetMapping("/contact")
    public String contactPage(){
        return "contact";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

}
