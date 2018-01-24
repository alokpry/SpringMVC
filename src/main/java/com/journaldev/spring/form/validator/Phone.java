package com.journaldev.spring.form.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;


public class Phone {
	@Documented
	@Constraint(validatedBy = PhoneValidator.class)
	@Target( { ElementType.METHOD, ElementType.FIELD })
	@Retention(RetentionPolicy.RUNTIME)
	public @interface PhoneA {
	 
	     
	    String message() default "{Phone}";
	     
	    Class<?>[] groups() default {};
	     
	    Class<? extends Payload>[] payload() default {};
	      
	}
}
