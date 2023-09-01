package tech.gustvmorais.criandoAPI.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.gustvmorais.criandoAPI.model.Usuario;

@Repository
public interface IUsuario extends JpaRepository<Usuario, Integer> {
    //Biblioteca permite recuperar dados do banco via API
    /*DAO: Responsavel por trazer os dados de forma independente se estiver em um
    arquivo ou em um banco de dados*/
}
