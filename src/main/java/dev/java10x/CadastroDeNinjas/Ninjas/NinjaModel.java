package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

// Entity transforma uma classe em uma entidade no BD
// jpa = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@Data // Creia todos os getters e setters
@NoArgsConstructor // Cria construtor vazio
@AllArgsConstructor // Cria cronstrutor cheio
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Passar uma estratégia, como vair gerar i id automaticamente
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // @ManyToOne - Um ninja tem uma unica missão.
    @ManyToOne
    @JoinColumn(name = "missoes_id") //FK - Foreing Key
    private MissoesModel missoes;
}
