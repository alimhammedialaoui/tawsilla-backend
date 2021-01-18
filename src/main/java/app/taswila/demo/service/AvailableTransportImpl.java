package app.taswila.demo.service;

import app.taswila.demo.model.AvailableTransport;
import app.taswila.demo.repo.RepoAvailableTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AvailableTransportImpl implements AvailableTransportService {

    RepoAvailableTransport repoAvailableTransport;

    @Autowired
    public AvailableTransportImpl(RepoAvailableTransport repoAvailableTransport) {
        this.repoAvailableTransport = repoAvailableTransport;
    }

    @Override
    public List<AvailableTransport> searchByNameInDateAfterTimeFromAToB(String name, String date, String time,String A,String B) {
        Map<String,Integer> traget = new HashMap<>();
        traget.put("Casablanca",1);
        traget.put("Mohammadia",2);
        traget.put("Rabat",3);
        traget.put("Kenitra",4);
        traget.put("Tanger",5);
        List<AvailableTransport> all = repoAvailableTransport.findByNameAndDate(name,date).stream().filter(transport->(
                traget.get(transport.getDeparture())>=traget.get(A)
                        && transport.getDeparture().equals(A)
                        && transport.getArrival().equals(B)
                )).collect(Collectors.toList());
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("HH:mm");
        LocalTime searchTime = LocalTime.parse(time,formatter);
        List<AvailableTransport> filteredList = all.stream().filter(transport->(
            LocalTime.parse(transport.getDepartureTime(),formatter).isAfter(searchTime)
        )).collect(Collectors.toList());
        return filteredList;
        // 1 --> 2 --> 3 --> 4
    }

    @Override
    public List<AvailableTransport> findAll() {
        return repoAvailableTransport.findAll();
    }
}
