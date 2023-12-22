package az.bdc.course.coursemanagement.exception;

import java.util.List;

public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(String id, String message) {
        super(message + " " + id);
    }

    public CustomerNotFoundException(String id) {
        super("Data not found: " + " " + id);
    }

    public CustomerNotFoundException(String message, List<String> s) {
        super(message + " " + String.join(" ", s));
    }

}
