package backend.psique.model.psicologo;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "psicologo")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Psicologo {
    @Id

    private String cpf;
    private String nome;
    private double salario;
    private String crp;
    private String qtde_paciente;

    public Psicologo(DadosCadastroPsicologo dados) {
        this.cpf = dados.cpf();
        this.nome = dados.nome();
        this.salario = dados.salario();
        this.crp = dados.crp();
        this.qtde_paciente = dados.qtde_paciente();
    }
}
