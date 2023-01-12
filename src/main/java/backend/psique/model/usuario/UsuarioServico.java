package backend.psique.model.usuario;

import backend.psique.model.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServico {
    @Autowired
    private UsuarioRepository repository;
    @Autowired
    private Mensagem mensagem;

    private PasswordEncoder encoder;

    public UsuarioServico(PasswordEncoder encode) {
        this.encoder = encode;
    }

    public UsuarioServico() {

    }

    public ResponseEntity<?>cadastrar(Usuario user){
        //user.setSenha(encoder.encode(user.getSenha()));
        repository.save(user);
        return new ResponseEntity<>(mensagem,HttpStatus.CREATED);
    }

    public ResponseEntity<?> validarLogin(Usuario usuario) {
        Optional<Usuario> optionalUsuario = repository.findByUsername(usuario.getUsername());
        if(optionalUsuario.isPresent()){
            if(encoder.matches(usuario.getPassword(),optionalUsuario.get().getPassword())){
                System.out.println(Optional.of(optionalUsuario.get()));
                mensagem.setMensagem("Login realizado com sucesso");
                return new ResponseEntity<>(mensagem,HttpStatus.OK);
            }else{
                mensagem.setMensagem("Verifique os dados e tente novamente");
                return new ResponseEntity<>(mensagem,HttpStatus.UNAUTHORIZED);
            }
    }else {
            mensagem.setMensagem("Verifique os dados e tente novamente");
            return new ResponseEntity<>(mensagem,HttpStatus.UNAUTHORIZED);
        }
    }
}
