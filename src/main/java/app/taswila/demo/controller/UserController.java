package app.taswila.demo.controller;

import app.taswila.demo.model.Utilisateur;
import app.taswila.demo.repo.RepoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    RepoUser repoUser;

    @Autowired
    public UserController(RepoUser repoUser) {
        this.repoUser = repoUser;
    }

    @PostMapping("/addUser")
    public Utilisateur addUser(@RequestBody Utilisateur user){
        return repoUser.save(user);
    }
}
