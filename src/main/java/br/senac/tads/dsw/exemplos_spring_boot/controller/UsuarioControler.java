package br.senac.tads.dsw.exemplos_spring_boot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioControler {
    @GetMapping("/ping")
    public String testarConexao() {
        return "A API de Usuarios esta online e funcionando.";
    }
}
