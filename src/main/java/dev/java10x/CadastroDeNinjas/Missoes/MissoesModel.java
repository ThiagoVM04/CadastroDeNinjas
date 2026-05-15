package dev.java10x.CadastroDeNinjas.Missoes;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data // Creia todos os getters e setters
@NoArgsConstructor // Cria construtor vazio
@AllArgsConstructor // Cria cronstrutor cheio
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_missao")
    private Long id;

    @Column(name = "nome_missao")
    private String nomeMissao;

    @Column(name = "rank")
    private String rank;

    // OneToMany - Uma missão pode ter vários ninjas.
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;
}
