package org.example;

public class PasswordValidator {

    public static final String WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE = "password should be more than 8 words and less than 12 words.";

    public static void validate(String password) {
        int length = password.length();
        if(length < 8 || length >12){
            throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
        }

    }
}
