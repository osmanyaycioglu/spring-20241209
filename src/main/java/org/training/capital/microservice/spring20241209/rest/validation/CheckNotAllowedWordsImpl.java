package org.training.capital.microservice.spring20241209.rest.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;

public class CheckNotAllowedWordsImpl implements ConstraintValidator<CheckNotAllowedWords, String> {

    private CheckNotAllowedWords anno;

    @Override
    public void initialize(final CheckNotAllowedWords constraintAnnotation) {
        anno = constraintAnnotation;
    }

    @Override
    public boolean isValid(final String value,
                           final ConstraintValidatorContext context) {
//        for (String sLoc : anno.value()) {
//            if (value.contains(sLoc)){
//                return false;
//            }
//        }

        return Arrays.stream(anno.value())
                     .noneMatch(value::contains);
    }
}
