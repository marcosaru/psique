package backend.psique.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("paciente")
public class PacienteController {
    @GetMapping
    public String visualizar(){
        return "Olá";
    }
}
