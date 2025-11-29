number = int(input("Enter an integer: "))

sumOfFactorial = 0

for count in range(1, number):
    if number % count == 0:
        sumOfFactorial += count

if sumOfFactorial == number:
    print("This is a perfect number")
else:
    print("This is not a perfect number")
