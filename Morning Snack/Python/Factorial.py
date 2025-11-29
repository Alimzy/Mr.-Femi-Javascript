number = int(input("Enter an integer: "))
sumOfFactorial = 1
for count in range(1, number + 1):
    sumOfFactorial *= count

print(sumOfFactorial)
