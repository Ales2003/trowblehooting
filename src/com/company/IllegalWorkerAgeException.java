package com.company;

public class IllegalWorkerAgeException extends RuntimeException{

    public IllegalWorkerAgeException() {
    }

    public IllegalWorkerAgeException(String format) {
        super(format);
    }
}
