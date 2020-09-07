package com.example.client.demo.configuration.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@org.springframework.web.bind.annotation.RestController

public class RestController {

    @GetMapping("/start")
    public RedirectView beforeRedirect() {

        return new RedirectView("end");
    }

    @GetMapping("/end")
    public String finishRedirect() {

        return "Success redirect";
    }
}
