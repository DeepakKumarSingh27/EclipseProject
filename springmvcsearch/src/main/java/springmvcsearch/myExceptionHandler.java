package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class myExceptionHandler {

	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class )
	public String exceptionHandlerNull(Model m) {

		m.addAttribute("msg", "Number format exception as occured");
		return "null_page";
	}

	@ExceptionHandler(value= NumberFormatException.class )
	public String exceptionHandlerNumberFormat(Model m) {
		m.addAttribute("ms", "NumberFormatException has occured");

		return "null_page";
	}

	@ExceptionHandler(value=Exception.class )
	public String exceptionGeneric(Model m) {
		m.addAttribute("ms", "Exception has occured");

		return "null_page";
	}
}
