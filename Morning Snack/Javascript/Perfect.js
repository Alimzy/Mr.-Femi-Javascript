let number = 7

let sumOfFactorial = 0

for(let count = 1; count < number;count++){
 if(number % count == 0){
  sumOfFactorial += count
}
}

if(sumOfFactorial == number){
console.log("This is a perfect number")
}else{
console.log("This is a not perfect number")
}
