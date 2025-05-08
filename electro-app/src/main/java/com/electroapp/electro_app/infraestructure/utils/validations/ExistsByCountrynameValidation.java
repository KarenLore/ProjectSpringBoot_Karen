package com.electroapp.electro_app.infraestructure.utils.validations;

import org.springframework.beans.factory.annotation.Autowired;

import com.electroapp.electro_app.application.services.ICountryService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ExistsByCountrynameValidation implements ConstraintValidator<ExistsByCountryname, String> {
    @Autowired
    private ICountryService service;

    @Override
    public boolean isValid(String countryname, ConstraintValidatorContext context) {
        if(service == null){
            return true;
        }
        return !service.existsByCountryname(countryname);
    }

}
