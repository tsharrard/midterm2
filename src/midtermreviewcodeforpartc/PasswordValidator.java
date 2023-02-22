package midtermreviewcodeforpartc;

// comment

class PasswordValidator {
private String password;
private int minLength = 8;
private int minSpecialCharCount = 1;

public PasswordValidator(String password) {
    this.password = password;
}

/**
 * A method to validate the password based on the following rules:
 * 1. The password must be at least minLenght
 * 2. The password must contain minSpecialCharCount
 */
public boolean validate() {
    if (password.length() < minLength) {
        System.out.println("Passwords must have at least " + minLength + " characters");
        return false;
    }
    
    int specialCharCount=0;
    //iterate over each character to see if it is a special character
    for(int i=0;i<password.length(); i++)
    {
        if(!(Character.isLetterOrDigit(password.charAt(i))))
        {
            //now we know there is at least one special character
            specialCharCount++;
        }
    }
    if(specialCharCount < minSpecialCharCount) {
        System.out.println("Passwords must have at least " +  minSpecialCharCount + " special character");
        return false;
    }
    return true;
}
}  


