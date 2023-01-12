package backend.psique.servico;

import backend.psique.model.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class Servico {
    @Autowired
    private Mensagem mensagem;



}
