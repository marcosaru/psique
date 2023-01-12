package backend.psique.model.evolucao;

import backend.psique.model.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ServicoEvolucao {
    @Autowired
    private Mensagem mensagem;
    @Autowired
    private EvolucaoRepository repository;
    //@Autowired
    //private PasswordEncoder encoder;

    public ResponseEntity<?>cadastrar(Evolucao obj){
        if(obj.getDescricao() == null) {
            mensagem.setMensagem("Descrição não pode ser nula");
            return ResponseEntity.badRequest().body(mensagem);
        }else if(obj.getDescricao().length() < 10) {
            mensagem.setMensagem("Descrição deve ter no mínimo 10 caracteres");
            return ResponseEntity.badRequest().body(mensagem);
        }else
            repository.save(obj);
            mensagem.setMensagem("Evolução cadastrada com sucesso");
            return ResponseEntity.ok(mensagem);
    }
}
