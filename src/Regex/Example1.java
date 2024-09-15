package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static boolean checkValidation(String str){

        String regex="^[A-Z][a-zA-Z]{2}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Username:");
        String str=sc.nextLine();

        if(checkValidation(str)){
            System.out.println("Validation successful");
        }else {
            System.out.println("Invalid Username:-The Username Must be start with Capital Letter");
        }

    }


}
