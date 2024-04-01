package com.Anish.CarbonCellAsgmnt.service;

import com.Anish.CarbonCellAsgmnt.model.DataEntry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataService {


    private String apiUrl;

    public DataService(@Value("${api.url}") String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public List<DataEntry> fetchData(String category, int limit) {
       //Logic to fetch to DataBase
        return null;
    }

}
