package backend.psique.controller;

import backend.psique.model.psicologo.DadosCadastroPsicologo;
import backend.psique.model.psicologo.Psicologo;
import backend.psique.model.psicologo.PsicologoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cadastrarpsicologo")
public class PsiController {
    @Autowired
    private PsicologoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPsicologo dados){
        repository.save(new Psicologo(dados));
    }
    @GetMapping
    public String visualizar(){
        return "Olá";
    }
}
