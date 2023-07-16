package com.springMVCSearch.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerClass {

	 @ExceptionHandler(Exception.class) 
	 public String ExceptionHandler(Exception e) 
	 { System.out.println("Exception >>>>>>"+e); return "exception_page"; }
}
