package backend.psique.controller;

import backend.psique.model.consulta.Consulta;
import backend.psique.model.consulta.ConsultaRepository;
import backend.psique.model.consulta.DadosConsulta;
import backend.psique.model.consulta.ServicoConsulta;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ConsultaController {
    @Autowired
    private ConsultaRepository repository;
    @Autowired
    private ServicoConsulta servicoConsulta;
    @PostMapping("cadastrarconsulta")
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody @Valid DadosConsulta dados){
        return servicoConsulta.cadastrar(new Consulta(dados));
    }
    @GetMapping("/listar")
    public List<Consulta> listar(){
        return repository.findAll();
    }
    @GetMapping("/listar/{cpf}")
    public List<Consulta> ListarPorCpf(@PathVariable String cpf){
        return repository.findByPaciente_Cpf(cpf);
    }
}
