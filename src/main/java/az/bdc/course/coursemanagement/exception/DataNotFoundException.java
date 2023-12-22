package az.bdc.course.coursemanagement.exception;

import java.util.List;

public class DataNotFoundException  extends RuntimeException {

    public DataNotFoundException(String id, String message) {
        super(message + " " + id);
    }

    public DataNotFoundException(Object id) {
        super("Data not found: " + " " + id);
    }

    public DataNotFoundException(String message, List<String> s) {
        super(message + " " + String.join(" ", s));
    }

}