package ru.abramov.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller

public class FirstController {

    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        model.addAttribute("message", name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/hello-two")
    public String helloPage2(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "surname", required = false) String surname
    ) {

        System.out.println(name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
