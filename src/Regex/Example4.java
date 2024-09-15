package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {
    public static boolean checkValidation(String str){
        String regex="^91 [0-9]{10}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:-");
        String str=sc.nextLine();

        if(checkValidation(str)){
            System.out.println("satisfied");
        }
        else {
            System.out.println("not");
        }

    }
}
