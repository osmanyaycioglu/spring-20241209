package org.training.capital.microservice.spring20241209.rest.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
@Constraint(validatedBy = { CheckNotAllowedWordsImpl.class})
public @interface CheckNotAllowedWords {

    String[] value();

    String message() default "Not allowed words : {value}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
