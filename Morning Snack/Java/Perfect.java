import java.util.Scanner;

public class Perfect{
public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a number: ");
int number = input.nextInt();

int sumOfFactorial = 0;

for(int counter = 1; counter < number; counter++){
    if(number % counter == 0){
       sumOfFactorial += counter;
}
}

if(sumOfFactorial == number){
System.out.println("This is a perfect number");

}else{
System.out.println("This is not a perfect number");

}



}

}
