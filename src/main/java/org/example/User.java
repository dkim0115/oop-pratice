package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator){
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String password = passwordGenerator.generatePassword();
        /**
         * * The password must be at least 8 characters and not more than 12 characters.
         */
        if(password.length() >=8 && password.length() <=12){
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
