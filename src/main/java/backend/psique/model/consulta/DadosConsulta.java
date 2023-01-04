package backend.psique.model.consulta;

import backend.psique.model.paciente.Paciente;
import backend.psique.model.psicologo.Psicologo;

public record DadosConsulta(Psicologo psicologo, Paciente paciente, String data_consulta, String valor) {
}
