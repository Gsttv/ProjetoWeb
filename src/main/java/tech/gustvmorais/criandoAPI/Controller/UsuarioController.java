package tech.gustvmorais.criandoAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.gustvmorais.criandoAPI.DAO.IUsuario;
import tech.gustvmorais.criandoAPI.model.Usuario;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private IUsuario dao;
    @GetMapping("/usuario")
    public List<Usuario> Listausuario(){
        return (List<Usuario>) dao.findAll();
    }
}
