def fibonacci(number):
    if(number<=1):
        return number
    else:
        return fibonacci(number-1)+fibonacci(number-2)
    

fib_num=int(input("How many fibonacci numbers to generate :"))

if fib_num<=0:
    print("Please enter a positive number")
else:
    print("Fibonacci sequence :")
    for i in range(fib_num):
        print(fibonacci(i))



