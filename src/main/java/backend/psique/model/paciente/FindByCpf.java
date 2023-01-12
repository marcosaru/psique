package backend.psique.model.paciente;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FindByCpf extends JpaRepository<Paciente, String> {
    Paciente findByCpf(String cpf);
}
