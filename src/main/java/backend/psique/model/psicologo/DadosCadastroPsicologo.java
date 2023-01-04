package backend.psique.model.psicologo;

import backend.psique.model.endereco.DadosEndereco;

public record DadosCadastroPsicologo(String nome, String crp, String cpf, Double salario, String qtde_paciente) {
}
