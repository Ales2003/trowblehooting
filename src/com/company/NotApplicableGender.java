package com.company;

/**
 * Created by USER on 21.03.2016.
 */
public class NotApplicableGender extends RuntimeException{
    public NotApplicableGender(String want, String gender){
        super(String.format("Acceptable gender %s, but found %s", want,gender));
    }
}
