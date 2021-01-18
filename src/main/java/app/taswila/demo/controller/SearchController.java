package app.taswila.demo.controller;

import app.taswila.demo.model.AvailableTransport;
import app.taswila.demo.model.SearchRequest;
import app.taswila.demo.service.AvailableTransportImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    AvailableTransportImpl availableTransport;

    @Autowired
    public SearchController(AvailableTransportImpl availableTransport) {
        this.availableTransport = availableTransport;
    }

    @GetMapping("/transport")
    public List<AvailableTransport> getAll(){
        return availableTransport.findAll();
    }

    @PostMapping("/search")
    public List<AvailableTransport> getSearchResult(@RequestBody SearchRequest searchRequest){
        return
                availableTransport.searchByNameInDateAfterTimeFromAToB(
                        searchRequest.getPreference(),
                        searchRequest.getDate(),
                        searchRequest.getTime(),
                        searchRequest.getDeparture(),
                        searchRequest.getArrival());
    }
}
