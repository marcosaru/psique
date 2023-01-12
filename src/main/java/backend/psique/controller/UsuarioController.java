package backend.psique.controller;

import backend.psique.model.usuario.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @Autowired(required = true)
    private PasswordEncoder encoder;

    @PostMapping("/cadUser")
    public ResponseEntity<?> cadastrarUsuario(@RequestBody Usuario usuario) {
        return new UsuarioServico(encoder).cadastrar(usuario);
    }

    @PostMapping("/cad")
    @Transactional
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Usuario cadastrar(@RequestBody DadosCadastroUsuario usuario) {
        Usuario user = new Usuario(usuario);
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPsicologo().getCpf());
        repository.save(user);
        return user;
    }
    @GetMapping("/loginUser")
    public ResponseEntity<?> LoginUsuario(@RequestBody Usuario usuario) {
        System.out.println(usuario);
        return new UsuarioServico(encoder).validarLogin(usuario);
    }
}