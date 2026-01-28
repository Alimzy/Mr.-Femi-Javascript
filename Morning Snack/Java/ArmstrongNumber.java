public class ArmstrongNumber{
 public static void main(String... args){
System.out.println(isArmstrong(145));
}

public static boolean isArmstrong(int number){
   int originalNumber = number;
   String newNumber = number + "";
   int length = newNumber.length();
   int multiplication = 1;
   int sum = 0;
    
    while(length > 1){
    int lastDigit = number % 10;
        number = number / 10;

    for(int count = 1;count < length;count++){
    multiplication = multiplication * count;
    sum += multiplication;
    multiplication = 1;

        }

}

if(sum == originalNumber){
return true;
}else{
return false;
}

   




}



}

