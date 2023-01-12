package backend.psique.model.consulta;

import backend.psique.model.paciente.Paciente;
import backend.psique.model.psicologo.Psicologo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "consulta")
@Table(name = "consulta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private Date data_consulta;
    private Double valor;
    @OneToOne
    private Psicologo psicologo;
    @OneToOne
    private Paciente paciente;

    public Consulta(DadosConsulta dados) {
        this.data_consulta = dados.data_consulta();
        this.valor = dados.valor();
        this.psicologo = dados.psicologo();
        this.paciente = dados.paciente();
    }
}