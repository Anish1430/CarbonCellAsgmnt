package com.Anish.CarbonCellAsgmnt.controller;

import com.Anish.CarbonCellAsgmnt.model.DataEntry;
import com.Anish.CarbonCellAsgmnt.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping
    public ResponseEntity<?> fetchData(@RequestParam(required = false) String category,
                                       @RequestParam(defaultValue = "10") int limit) {
        List<DataEntry> data = dataService.fetchData(category, limit);
        return ResponseEntity.ok(data);
    }
}
