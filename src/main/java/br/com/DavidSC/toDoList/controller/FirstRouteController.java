package br.com.DavidSC.toDoList.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstMethod")
public class FirstRouteController {

    public String firstMessage() {
        return "Beleza";
    }
}