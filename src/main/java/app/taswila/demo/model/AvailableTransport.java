package app.taswila.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class AvailableTransport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String date;
    private String departureTime;
    private String arrivalTime;
    private String departure;
    private String arrival;
    @ElementCollection
    private List<String> transitTime;

    public AvailableTransport(String name, String date, String departureTime, String arrivalTime, String departure, String arrival, List<String> transitTime) {
        this.name = name;
        this.date = date;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departure = departure;
        this.arrival = arrival;
        this.transitTime = transitTime;
    }

    public AvailableTransport() {
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameTransport) {
        this.name = nameTransport;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public List<String> getTransitTime() {
        return transitTime;
    }

    public void setTransitTime(List<String> transitTime) {
        this.transitTime = transitTime;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
}
