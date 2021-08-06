package ifsp.lp3a5.mars.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ServiceHandlers extends ResponseEntityExceptionHandler {

    Logger logger = LoggerFactory.getLogger(ServiceHandlers.class);

    @ExceptionHandler(RuntimeException.class)
    protected ResponseEntity<Object> handler(Exception e, WebRequest req) {
        Object message = e.getMessage();
        logger.error("M=handler message={}", message);
        return handleExceptionInternal(e, message, new HttpHeaders(), HttpStatus.OK, req);
    }

}
