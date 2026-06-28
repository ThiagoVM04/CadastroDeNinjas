package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    //Listar todas as missoes
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    //Listar todas ad missoes por ID
    public MissoesModel listarMissoesId(Long id){
        Optional<MissoesModel> missoesPorId = missoesRepository.findById(id);
        return missoesPorId.orElse(null);
    }

    //Criar missoes
    public MissoesModel criarMissao(MissoesModel missao){
        return missoesRepository.save(missao);
    }

    //Deletar missoes
    public void deletarMissaoId(Long id){
        missoesRepository.deleteById(id);
    }

    //Atualizar missoes
    public MissoesModel atualizarMissao(Long id, MissoesModel missaoAtualizada){
        if (missoesRepository.existsById(id)) {
            missaoAtualizada.setId(id);
            return missoesRepository.save(missaoAtualizada);
        }
        return null;
    }
}
