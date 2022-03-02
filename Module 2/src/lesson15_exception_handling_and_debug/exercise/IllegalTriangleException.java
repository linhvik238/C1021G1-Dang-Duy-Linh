package lesson15_exception_handling_and_debug.exercise;

public class IllegalTriangleException extends Exception {
    String error;
    public IllegalTriangleException(String error){
        super();
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
