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

    public Psicologo(Psicologo psicologo) {
        this.cpf = psicologo.getCpf();
        this.nome = psicologo.getNome();
        this.salario = psicologo.getSalario();
        this.crp = psicologo.getCrp();
        this.qtde_paciente = psicologo.getQtde_paciente();
    }
}
