let sum = 0

for(let counter = 1900; counter <= 2025; counter++){
 if( counter % 4 == 0 && counter % 100 != 0 || counter % 400 == 0){
sum += 1



}
}

console.log(sum)
