package app.taswila.demo.controller;

import app.taswila.demo.model.Utilisateur;
import app.taswila.demo.repo.RepoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    RepoUser repoUser;

    @Autowired
    public UserController(RepoUser repoUser) {
        this.repoUser = repoUser;
    }

    @GetMapping("/users")
    public List<Utilisateur> users(){
        return repoUser.findAll();
    }

    @PostMapping("/addUser")
    public Utilisateur addUser(@RequestBody Utilisateur user){
        return repoUser.save(user);
    }
}
