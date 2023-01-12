package backend.psique.model.consulta;

import backend.psique.model.paciente.Paciente;
import backend.psique.model.psicologo.Psicologo;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record DadosConsulta(
        Psicologo psicologo,
        Paciente paciente,
        Date data_consulta,
        Double valor) {
}
