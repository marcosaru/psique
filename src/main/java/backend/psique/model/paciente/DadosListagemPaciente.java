package backend.psique.model.paciente;

import backend.psique.model.endereco.Endereco;

public record DadosListagemPaciente(String nome, String cpf, String telefone, Endereco endereco) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getCpf(), paciente.getTelefone(), paciente.getEndereco());
    }
}
