package com.example.bai3.Validator;

import com.example.bai3.repository.IUserRepository;
import com.example.bai3.Validator.annotation.ValidUsername;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class    ValidUsernameValidator implements ConstraintValidator <ValidUsername, String>{
    @Autowired
    private IUserRepository userRepository;
    public boolean isValid(String username, ConstraintValidatorContext context){
        if (userRepository == null)
            return true;
        return userRepository.findByUsername(username)==null;
    }   
}
