package com.definex.training.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author OnurCil on 25/09/2019
 * @project demo
 */

@Controller
public class SampleControoler {
    @Value("${test.demo.name}")
    String appName;

    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("appName",appName);
        return "home";
    }
}
