package com.example.Rota_CTU.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroController {
    @RequestMapping("/cadastro")
    public String telaCadastro(){
        return "pages-cadastro/cadastro";
    }

}
