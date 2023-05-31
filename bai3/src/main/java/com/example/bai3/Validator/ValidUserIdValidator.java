package com.example.bai3.Validator;

import com.example.bai3.Validator.annotation.ValidUserId;
import jakarta.validation.ConstraintValidator;
import com.example.bai3.entity.User;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId,User> {
    @Override
    public boolean isValid (User user, ConstraintValidatorContext context){
        if(user== null)
            return true;
        return user.getId()!=null;

    }
}
