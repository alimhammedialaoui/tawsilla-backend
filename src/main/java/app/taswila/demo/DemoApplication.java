package app.taswila.demo;

import app.taswila.demo.model.AvailableTransport;
import app.taswila.demo.model.Utilisateur;
import app.taswila.demo.repo.RepoAvailableTransport;
import app.taswila.demo.repo.RepoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


    RepoAvailableTransport repoAvailableTransport;
    RepoUser repoUser;

    @Autowired
    public DemoApplication(RepoAvailableTransport repoAvailableTransport,RepoUser repoUser) {
        this.repoAvailableTransport = repoAvailableTransport;
        this.repoUser = repoUser;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<String> t1 = new ArrayList<>(Arrays.asList("17:00","17:30","18:00","18:30","22:00"));
        List<String> t2 = new ArrayList<>(Arrays.asList("17:55","18:25","","",""));
        List<String> t3 = new ArrayList<>(Arrays.asList("","","17:30","18:20",""));
        List<String> t4 = new ArrayList<>(Arrays.asList("","","","17:05","18:00"));
        List<String> t5 = new ArrayList<>(Arrays.asList("22:00","22:30","23:00","23:25",""));

        AvailableTransport transport1 = new AvailableTransport("Train","21/11/2021","17:00","22:00","Casablanca","Tanger",t1);
        AvailableTransport transport2 = new AvailableTransport("Train","22/11/2021","17:55","19:00","Casablanca","Rabat",t2);
        AvailableTransport transport3 = new AvailableTransport("Train","21/11/2021","17:30","18:20","Rabat","Kenitra",t3);
        AvailableTransport transport4 = new AvailableTransport("Train","19/11/2021","17:05","18:00","Kenitra","Tanger",t4);
        AvailableTransport transport5 = new AvailableTransport("Train","21/11/2021","22:00","23:25","Casablanca","Kenitra",t5);

        repoAvailableTransport.saveAll(Arrays.asList(transport1,transport2,transport3,transport4,transport5));

        Utilisateur user = new Utilisateur(20, "homme","Train", 0, 50, false);

        repoUser.save(user);
    }
}
