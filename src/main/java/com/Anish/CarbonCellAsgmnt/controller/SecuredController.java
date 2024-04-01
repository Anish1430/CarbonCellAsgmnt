package com.Anish.CarbonCellAsgmnt.controller;

import com.Anish.CarbonCellAsgmnt.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/secured")
public class SecuredController {

    @GetMapping
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<String> securedEndpoint() {

        //// Endpoint accessible only to authenticated users

        return ResponseEntity.ok("Authenticated user accessed secured endpoint");
    }
}
