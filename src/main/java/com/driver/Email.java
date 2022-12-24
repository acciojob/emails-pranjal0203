package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(oldPassword == this.password){
            if(newPassword.length() > 7){
                int upperCase = 0;
                int lowerCase = 0;
                int digit = 0;
                int specialChar = 0;
                for(int i=0;i<newPassword.length();i++){
                    if(newPassword.charAt(i) >= 97 && newPassword.charAt(i) <= 122) lowerCase=1;

                    else if(newPassword.charAt(i) >= 65 && newPassword.charAt(i) <= 89) upperCase=1;

                    else if(newPassword.charAt(i) >= 48 && newPassword.charAt(i) <= 57) digit=1;
                    else specialChar = 1;
                }
                if(upperCase == 1 && lowerCase==1 && digit==1 && specialChar==1){
                    this.password = newPassword;
                }
            }
        }
    }
}
