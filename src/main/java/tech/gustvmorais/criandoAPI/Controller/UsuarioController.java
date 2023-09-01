package tech.gustvmorais.criandoAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.gustvmorais.criandoAPI.DAO.IUsuario;
import tech.gustvmorais.criandoAPI.model.Usuario;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private IUsuario dao;
    @GetMapping
    public List<Usuario> Listausuario(){
        return (List<Usuario>) dao.findAll();
    }
    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
         Usuario novoUsuario = dao.save(usuario);
         return novoUsuario;
    }

    @PutMapping
    public Usuario alterarUsuario (@RequestBody Usuario usuario){
        Usuario novoUsuario = dao.save(usuario);
        return novoUsuario;
    }

    @DeleteMapping("/{id}")
    public Optional<Usuario> deletarUsuario (@PathVariable Integer id){
        Optional<Usuario> usuario = dao.findById(id);
        dao.deleteById(id);
        return usuario;
    }
}
