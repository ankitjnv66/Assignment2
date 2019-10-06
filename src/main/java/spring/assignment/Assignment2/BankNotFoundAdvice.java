package spring.assignment.Assignment2;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class BankNotFoundAdvice {

	public String bankotFound(BankNotFoundException ex) {
		return ex.getMessage();
	}
}
