numbers=list(input("Enter a sequence of values").split(","))

sum=0

for i in numbers:
    sum=sum+int(i)

print(sum)