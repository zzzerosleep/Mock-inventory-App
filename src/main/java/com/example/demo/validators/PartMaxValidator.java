package com.example.demo.validators;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import com.example.demo.domain.Part;

public class PartMaxValidator implements ConstraintValidator<ValidPartMax, Part> {
    @Override
    public void initialize(ValidPartMax constraintAnnotation) {
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext context) {
        boolean isValid = part.getInv() > part.getMax();

        if (isValid) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Inventory must be less than max").addPropertyNode("max").addConstraintViolation();
        }

        if (part == null) {
            return false;
        }

        if (part.getInv() > part.getMax()) {
            return false;

        } else return true;
    }
}