

for(let number = 1; number <= 1000; number++){
    let sumOfNumber = 0;
    for(let numberTwo =1; numberTwo < number; numberTwo++){
         if(number % numberTwo == 0){
            sumOfNumber += numberTwo
}                
    }

   if(sumOfNumber == number){
   console.log(number)

}


}

