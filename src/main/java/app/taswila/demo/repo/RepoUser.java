package app.taswila.demo.repo;

import app.taswila.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoUser extends JpaRepository<User,Integer> {
}
