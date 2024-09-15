package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example5 {
    public static boolean checkEmailValidation(String str){
        String regex="^.{8,}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Password:-");
        String str=sc.nextLine();

        if(checkEmailValidation(str)){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }

    }
}
