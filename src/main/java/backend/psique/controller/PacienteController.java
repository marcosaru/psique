package backend.psique.controller;

import backend.psique.model.paciente.*;
import jakarta.annotation.security.PermitAll;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("paciente")
public class PacienteController {
    @Autowired
    private PacienteRepository repository;
    @Autowired
    private ServicoPaciente servicoPaciente;
    @PostMapping
    @Transactional
    @PermitAll
    public ResponseEntity<?> cadastrar(@RequestBody @Valid DadosCadastroPaciente dados){
        return servicoPaciente.cadastrar(new Paciente(dados));
    }
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping
    public Page<DadosListagemPaciente> visualizar(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }
}
