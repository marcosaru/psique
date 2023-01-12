package backend.psique.model.usuario;

import backend.psique.model.psicologo.Psicologo;

public record DadosCadastroUsuario(String email, String senha, Psicologo psicologo) {

}
