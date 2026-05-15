package dev.java10x.CadastroDeNinjas.Missoes;
/* JpaRepository Simplifica para lidar com banco de dados
para qual classe o JPA vai querer quw ORM (Mapeamento de objeto relacional) vai ficar
escaneando/salvando/excluindo entidades e convertendo tabelas no BD */
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
