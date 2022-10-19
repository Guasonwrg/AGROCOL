package com.agrocol.agrocol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("menu")
    public String menu() {
        return "menu";
    }
    @GetMapping("usuarios")
    public String usuario() {
        return "usuario";
    }
    @GetMapping("formularios")
    public String formulario() {
        return "formulario";
    }
}
