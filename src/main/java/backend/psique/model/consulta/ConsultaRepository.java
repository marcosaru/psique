package backend.psique.model.consulta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultaRepository extends JpaRepository<Consulta, String> {
    List<Consulta> findByPaciente_Cpf(String cpf);
}
