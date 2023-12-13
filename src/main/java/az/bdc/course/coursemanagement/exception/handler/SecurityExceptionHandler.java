package az.bdc.course.coursemanagement.exception.handler;


import az.bdc.course.coursemanagement.exception.CustomerNotFoundException;
import az.bdc.course.coursemanagement.exception.utils.HttpResponseConstants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestControllerAdvice
@RequiredArgsConstructor
public class SecurityExceptionHandler extends ResponseEntityExceptionHandler {

    private static final String PRE_KEY = "SECURITY:";
    private static final String LANGUAGE_AZ = "az";
    private static final String LANGUAGE_EN = "en";
    private static final String LANGUAGE_RU = "ru";

    private static final String DEFAULT_LANGUAGE = "az";

    private static final String LANG_CODE = "lang";


//.

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Object> handle(IllegalArgumentException ex,
                                         WebRequest request) {
        log.error("RuntimeException: {}", ex.getMessage());
        return ofType(
                request,
                HttpStatus.BAD_REQUEST,
                ex.getMessage(),
                2121,
                Collections.emptyList()
        );
    }

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Object> handle(ArithmeticException ex,
                                         WebRequest request) {
        log.error("RuntimeException: {}", ex.getMessage());
        return ofType(
                request,
                HttpStatus.BAD_REQUEST,
                ex.getMessage(),
                2121,
                Collections.emptyList()
        );
    }

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<Object> handle(CustomerNotFoundException ex,
                                         WebRequest request) {
        log.error("RuntimeException: {}", ex.getMessage());
        return ofType(
                request,
                HttpStatus.NOT_FOUND,
                ex.getMessage(),
                2123,
                Collections.emptyList()
        );
    }


    private ResponseEntity<Object> ofType(WebRequest request,
                                          HttpStatus status,
                                          String techMessage,
                                          int code,
                                          List<?> validationErrors) {
        Map<String, Object> attributes = new HashMap<>();
        attributes.put(HttpResponseConstants.CODE, code);
        attributes.put(HttpResponseConstants.MESSAGE, techMessage);
        attributes.put(HttpResponseConstants.STATUS, status.value());
        attributes.put(HttpResponseConstants.ERROR, status.getReasonPhrase());
        if (!validationErrors.isEmpty()) {
            attributes.put(HttpResponseConstants.VALIDATION_ERRORS, validationErrors);
        }
        attributes.put(HttpResponseConstants.PATH,
                ((ServletWebRequest) request).getRequest().getRequestURI());
        return new ResponseEntity<>(attributes, status);
    }


}
