package backend.psique.model.paciente;

import backend.psique.model.consulta.Consulta;
import backend.psique.model.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "paciente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {
    @Id
    private String cpf;
    private String nome;
    private String telefone;
    private String evolucao;
    @Embedded
    private Endereco endereco;

}
