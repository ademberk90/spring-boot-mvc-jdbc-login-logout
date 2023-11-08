package com.mvcdblogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String showHomePage() {
        return "homepage";
    }

    @GetMapping("/employee")
    public String showEmployeePage() {
        return "employee";
    }

    @GetMapping("/manager")
    public String showManagerPage() {
        return "manager";
    }

    @GetMapping("/admin")
    public String showAdminPage() {
        return "admin";
    }
}
