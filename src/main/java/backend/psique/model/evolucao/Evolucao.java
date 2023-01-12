package backend.psique.model.evolucao;

import backend.psique.model.paciente.Paciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Entity
@Table(name = "evolucao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Evolucao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date data_evolucao;
    private String descricao;
    @ManyToOne
    private Paciente paciente;

    public Evolucao(DadosCadastroEvolucao dados) {
        this.data_evolucao = dados.data_evolucao();
        this.descricao = dados.descricao();
        this.paciente = new Paciente(dados.paciente());
    }
}