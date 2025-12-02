for count in range(1,1000):
    sumOfNumbers = 0
    for countTwo in range(1,count):
        if count % countTwo == 0:
            sumOfNumbers += countTwo
    if sumOfNumbers == count:
        print(count)
