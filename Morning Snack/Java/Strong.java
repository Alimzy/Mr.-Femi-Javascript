public class Strong{
public static void main(String... args){
int inputedNumber = 145;
int number = inputedNumber;
int factorial = 1;
int sum = 0;
while(number != 0){
    int digit = number % 10;
    for(int count = 1; count <= digit; count++){
        factorial *= count;
        

}   
 number = number/10;

sum += factorial;
factorial=1;
System.out.println(sum);
}
//System.out.println();
if(sum == inputedNumber){

System.out.println("This is a strong number");

}else{

System.out.println("This is not a strong number");
}


}

}
