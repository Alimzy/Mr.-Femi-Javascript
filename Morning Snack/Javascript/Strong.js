let inputedNumber = 145;
let number = inputedNumber;
let factorial = 1;
let sum = 0;
while(number != 0){
   let digit = number % 10;
    for(let count = 1; count <= digit; count++){
        factorial *= count;
        sum += factorial;
       console.log(factorial);

}   


 number = number/10;
        
factorial=1;
console.log(sum)
}


if(sum == inputedNumber){

console.log("This is a strong number");

}else{

console.log("This is not a strong number");
}
