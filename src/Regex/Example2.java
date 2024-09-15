package Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {
    public static boolean checkValidation(String str){
        String regex="^[a-zA-Z]{2}[A-Z]$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter userName:-");
        String str = sc.nextLine();

        if(checkValidation(str)){
            System.out.println("Validation SuccessFull");
        }
        else{
            System.out.println("Invalid userName:- The User Name must end with Capital letter");
        }

    }
}
