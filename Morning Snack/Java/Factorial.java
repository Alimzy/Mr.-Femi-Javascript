import java.util.Scanner;

public class Factorial{
    public static void main(String... args){
    Scanner input = new Scanner(System.in);
    int sumOfFactorial = 1;
     System.out.println("Enter an integer: ");
     int number = input.nextInt();
        for(int counter = 1; counter <= number;counter++){
        sumOfFactorial =  sumOfFactorial  * counter;
         
        
        }
        System.out.println(sumOfFactorial);

    }


}
