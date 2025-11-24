package com.raquielra.cadastrologin.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(@AuthenticationPrincipal UserDetails userDetails) {
        String username = userDetails.getUsername();
        
        return "<html><body>"
             + "<h1>Acesso Autorizado!</h1>"
             + "<p>Bem-vindo, <b>" + username + "</b>! Esta é a sua tela segura (em branco).</p>"
             + "</body></html>";
    }
}