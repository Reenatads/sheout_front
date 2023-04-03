package com.sheout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class InfrastructureWeb {
    
    @GetMapping("/index.html")
    public String index() {
        return "index";
    }

    @GetMapping("/clientHome.html")
    public String client_Home(){
        return "clientHome";
    }
    @RequestMapping("/adminHome")
    public String adminHome(Model model) {
        // controller logic
        return "adminHome";
    }
    @RequestMapping("/adminLogin")
    public String adminLogin(Model model) {
        // controller logic
        return "adminLogin";
    }
    @RequestMapping("/adminStoreManagement")
    public String adminStoreManagement(Model model) {
        // controller logic
        return "adminStoreManagement";
    }
    @RequestMapping("/clientCart")
    public String clientCart (Model model) {
        // controller logic
        return "clientCart";
    }

    @RequestMapping("/clientOrder.html")
    public String clientOrder (Model model) {
        // controller logic
        return "clientOrder";
    }
    @RequestMapping("/clientRegister.html")
    public String clientRegister (Model model) {
        // controller logic
        return "clientRegister";
    }
    @RequestMapping("/clientStore")
    public String clientStore (Model model) {
        // controller logic
        return "clientStore";
    }
}
    