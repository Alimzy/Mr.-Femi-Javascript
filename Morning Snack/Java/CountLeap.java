public class CountLeap{
public static void main(String... args){
int sum = 0;
for(int counter = 1900; counter <= 2025; counter++){

  if(counter % 4 == 0 && counter % 100 != 0 || counter % 400 == 0){
    sum += 1;

}



}


System.out.println(sum);
}

}
