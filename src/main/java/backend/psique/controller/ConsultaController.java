package backend.psique.controller;

import backend.psique.model.consulta.Consulta;
import backend.psique.model.consulta.ConsultaRepository;
import backend.psique.model.consulta.DadosConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cadastrarconsulta")
public class ConsultaController {
    @Autowired
    private ConsultaRepository repository;
    @PostMapping
    public void cadastrar(@RequestBody DadosConsulta dados){
        repository.save(new Consulta(dados));
    }
}
