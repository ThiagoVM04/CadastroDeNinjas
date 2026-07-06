package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity transforma uma classe em uma entidade no BD
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@Data // Creia todos os getters e setters
@NoArgsConstructor // Cria construtor vazio
@AllArgsConstructor // Cria cronstrutor cheio
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Passar uma estratégia, como vair gerar i id automaticamente
    @Column(name = "id_ninja")
    private Long id;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private int idade;

    @Column (name="rank")
    private String rank;

    // @ManyToOne - Um ninja tem uma unica missão.
    @ManyToOne
    @JoinColumn(name = "missoes_id") //FK - Foreing Key
    private MissoesModel missoes;
}