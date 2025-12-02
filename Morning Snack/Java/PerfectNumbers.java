

public class PerfectNumbers{
public static void main(String... args){

for(int counter =1; counter <= 1000; counter++){
    int perfectNumber = 0;
    for(int counterTwo = 1; counterTwo < counter ; counterTwo++){
     if(counter % counterTwo == 0){
      perfectNumber = perfectNumber + counterTwo;
        
    
           }


    }


if(perfectNumber == counter){
System.out.println(counter);
}

}




}


}
