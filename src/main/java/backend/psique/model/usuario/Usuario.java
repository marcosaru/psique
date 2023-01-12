package backend.psique.model.usuario;

import backend.psique.model.psicologo.Psicologo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "email")
    private String username;
    @Column(name="senha")
    private String password;
    @ManyToOne
    @JoinColumn(name = "cpf_psicologo")
    private Psicologo psicologo;
    @ManyToMany
    @JoinTable(name = "tb_user_roles",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "roleid"))
    private List<RoleModel> roles;

    public Usuario(DadosCadastroUsuario dados) {
        this.username = dados.email();
        this.password = dados.senha();
        this.psicologo = new Psicologo(dados.psicologo());
    }
    @Bean
    public UserDetailsService userDetailsService() {
        return (UserDetailsService) new UsuarioServico();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
