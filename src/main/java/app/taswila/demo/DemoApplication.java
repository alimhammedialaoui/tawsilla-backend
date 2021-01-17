package app.taswila.demo;

import app.taswila.demo.model.AvailableTransport;
import app.taswila.demo.repo.RepoAvailableTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


    RepoAvailableTransport repoAvailableTransport;

    @Autowired
    public DemoApplication(RepoAvailableTransport repoAvailableTransport) {
        this.repoAvailableTransport = repoAvailableTransport;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        AvailableTransport transport1 = new AvailableTransport("Train","21/11/2021","17:00","18:00","Casablanca","Tanger");
        AvailableTransport transport2 = new AvailableTransport("Train","22/11/2021","18:55","18:10","Casablanca","Rabat");
        AvailableTransport transport3 = new AvailableTransport("Train","21/11/2021","17:30","18:20","Rabat","Kenitra");
        AvailableTransport transport4 = new AvailableTransport("Train","19/11/2021","17:05","18:00","Kenitra","Tanger");
        AvailableTransport transport5 = new AvailableTransport("Train","21/11/2021","22:00","23:15","Casablanca","Kenitra");

        repoAvailableTransport.saveAll(Arrays.asList(transport1,transport2,transport3,transport4,transport5));

    }
}