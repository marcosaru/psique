package backend.psique.controller;

import backend.psique.model.evolucao.DadosCadastroEvolucao;
import backend.psique.model.evolucao.Evolucao;
import backend.psique.model.evolucao.EvolucaoRepository;
import backend.psique.model.evolucao.ServicoEvolucao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("evolucao")
public class EvolucaoController {
    @Autowired
   private EvolucaoRepository repository;
    @Autowired
    private ServicoEvolucao servicoEvolucao;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroEvolucao dados ) {
        servicoEvolucao.cadastrar(new Evolucao(dados));
    }
    @GetMapping("/cadastrar/{cpf}")
        public String cadastrar(@PathVariable String cpf){
        return "Evolução cadastrada com sucesso "+cpf;
        }

}
