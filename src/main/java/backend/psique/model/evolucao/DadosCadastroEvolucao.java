package backend.psique.model.evolucao;

import backend.psique.model.paciente.Paciente;

import java.util.Date;

public record DadosCadastroEvolucao(Date data_evolucao, String descricao, Paciente paciente) {

}
