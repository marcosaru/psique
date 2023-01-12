package backend.psique.model.paciente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

@EnableJpaRepositories
public interface PacienteRepository extends JpaRepository<Paciente, String> {


    Optional<Paciente> findByCpf(String cpf);

}
