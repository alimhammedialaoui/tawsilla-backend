package app.taswila.demo.repo;

import app.taswila.demo.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoUser extends JpaRepository<Utilisateur,Integer> {
}
