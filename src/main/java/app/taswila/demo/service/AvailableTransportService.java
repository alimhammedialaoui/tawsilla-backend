package app.taswila.demo.service;

import app.taswila.demo.model.AvailableTransport;

import java.util.List;

public interface AvailableTransportService {

    List<AvailableTransport> searchByNameInDateAfterTimeFromAToB(String name,String date,String time,String A,String B);
}
