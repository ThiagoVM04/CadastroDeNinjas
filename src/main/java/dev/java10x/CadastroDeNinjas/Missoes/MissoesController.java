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
    public List<MissoesDTO> listarMissao(){
       return missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public MissoesDTO listarMissoesId(@PathVariable Long id){
        return missoesService.listarMissoesId(id);
    }


    @PostMapping("/criar")
    public MissoesDTO criarMissao(@RequestBody MissoesDTO missao){
        return missoesService.criarMissao(missao);
    }

    @PutMapping("/alterar/{id}")
    public MissoesDTO atualizarMissao(@PathVariable Long id, @RequestBody MissoesDTO missaoAtualizada){
        return missoesService.atualizarMissao(id, missaoAtualizada);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarMissaoId(@PathVariable Long id){
        missoesService.deletarMissaoId(id);
    }
}
