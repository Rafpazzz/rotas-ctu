package com.example.Rota_CTU.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlunoController {

    @RequestMapping("/")
    public String telaInicial() {
        return "login";
    }

    @RequestMapping("/area-aluno")
    public String areaAluno() {
        return "area_aluno2";
    }
}
