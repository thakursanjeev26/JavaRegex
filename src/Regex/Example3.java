package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3 {
    public static boolean checkEmailValidation(String str){
        String regex="^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2})?$\n";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter EmailAddress:-");
        String str=sc.nextLine();

        if(checkEmailValidation(str)){
            System.out.println("Validation Successful");
        }
        else {
            System.out.println("invalid email");
        }
    }
}
