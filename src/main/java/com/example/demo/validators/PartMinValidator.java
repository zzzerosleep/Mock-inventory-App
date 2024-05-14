package com.example.demo.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import com.example.demo.domain.Part;

public class PartMinValidator implements ConstraintValidator<ValidPartMin, Part> {
    @Override
    public void initialize(ValidPartMin constraintAnnotation) {
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext context) {
        boolean isValid = part.getInv() < part.getMin();

        if (isValid) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Inventory must be more than Min").addPropertyNode("min").addConstraintViolation();
        }

        if (part == null) {
            return false;
        }

        if (part.getInv() < part.getMin()) {
            return false;

        } else return true;
    }
}