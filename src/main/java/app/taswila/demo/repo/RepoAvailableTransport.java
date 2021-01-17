package app.taswila.demo.repo;

import app.taswila.demo.model.AvailableTransport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RepoAvailableTransport extends JpaRepository<AvailableTransport,String> {

    @Query("select t from AvailableTransport t where t.name=:x and t.date=:y")
    List<AvailableTransport> findByNameAndDate(@Param("x") String name,@Param("y") String date);

}
