package com.Anish.CarbonCellAsgmnt.service;

import com.Anish.CarbonCellAsgmnt.controller.LoginRequest;
import com.Anish.CarbonCellAsgmnt.controller.UserDto;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public void registerUser(UserDto userDto) {
        // Implement user registration logic
    }

    public String authenticateUser(LoginRequest loginRequest) {
        // Implement user authentication logic
        return "Authentication Successful";
    }
}
