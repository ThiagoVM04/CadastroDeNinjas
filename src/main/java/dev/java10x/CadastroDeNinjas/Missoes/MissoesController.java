package dev.java10x.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping("/listar")
    public List<MissoesModel> listarMissao(){
       return missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesId(@PathVariable Long id){
        return missoesService.listarMissoesId(id);
    }


    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao){
        return missoesService.criarMissao(missao);
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterado com sucesso!";
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarMissaoId(@PathVariable Long id){
        missoesService.deletarMissaoId(id);
    }
}
