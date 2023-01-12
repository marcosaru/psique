package backend.psique.model.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;

    public Endereco(Endereco dados) {
        this.logradouro = dados.getLogradouro();
        this.bairro = dados.getBairro();
        this.cep = dados.getCep();
        this.cidade = dados.getCidade();
        this.uf = dados.getUf();
        this.numero = dados.getNumero();
        this.complemento = dados.getComplemento();
    }
    public Endereco (DadosEndereco dados){
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }
}
