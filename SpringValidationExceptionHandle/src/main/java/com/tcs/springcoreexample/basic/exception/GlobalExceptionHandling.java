package com.tcs.springcoreexample.basic.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandling {

	@ExceptionHandler(exception = NullPointerException.class)
	public ResponseEntity<Map<String,String>> handleNullPointerException
	(NullPointerException ne){
		Map<String, String> map = new HashMap<>();
		map.put("errorCode", "101");
		map.put("errorMessage", "There is some null pointerException");
		map.put("details", ne.getMessage());
		return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(exception = NumberFormatException.class)
	public ResponseEntity<Map<String,String>> handleNumberFormatException
	(NumberFormatException ne){
		Map<String, String> map = new HashMap<>();
		map.put("errorCode", "101");
		map.put("errorMessage", "Do not zero values");
		map.put("details", ne.getMessage());
		return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(exception = ArithmeticException.class)
	public ResponseEntity<Map<String,String>> handleArithmaticException
	(ArithmeticException ne){
		Map<String, String> map = new HashMap<>();
		map.put("errorCode", "101");
		map.put("errorMessage", "Do not give zero for input2");
		map.put("details", ne.getMessage());
		return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(exception=MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> handleBeanObject
	(MethodArgumentNotValidException me){
		BindingResult br = me.getBindingResult();
		Map<String, String> map = new HashMap<>();
		/*List<FieldError> list = br.getFieldErrors();
		for(FieldError er: list) {
			String field = er.getField();
			String message = er.getDefaultMessage();
			map.put(field, message);
		}*/
		br.getFieldErrors().forEach(x->map.put(x.getField(), x.getDefaultMessage()));
		return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
	}
}
