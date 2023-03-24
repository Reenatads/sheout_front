package com.sheout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class InfrastructureWeb {
    
    @GetMapping
    public String index() {
        return "index";
    }
    @RequestMapping("/clientHome")
    public String clientHome () {
        // controller logic
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
    @RequestMapping("/home")
    public String hHome (Model model) {
        // controller logic
        return "home";
    }

    @RequestMapping("/clientOrder")
    public String clientOrder (Model model) {
        // controller logic
        return "clientOrder";
    }
    @RequestMapping("/clientRegister")
    public String clientRegister (Model model) {
        // controller logic
        return "clientRegister";
    }
    @RequestMapping("/clientStore")
    public String clientStore (Model model) {
        // controller logic
        return "clientStore";
    }

    @RequestMapping("/storeHome")
    public String storeHome (Model model) {
        // controller logic
        return "storeHome";
    }
    @RequestMapping("/storeOrder")
    public String storeOrder (Model model) {
        // controller logic
        return "storeOrder";
    }
    @RequestMapping("/storeRegister")
    public String storeRegister (Model model) {
        // controller logic
        return "storeRegister";
    }
    @RequestMapping("/storeReportItems")
    public String storeReportItems (Model model) {
        // controller logic
        return "storeReportItems";
    }
    @RequestMapping("/storeReportOrders")
    public String storeReportOrders (Model model) {
        // controller logic
        return "storeReportOrders";
    }
}
    