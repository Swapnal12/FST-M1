numbers =list(input("Enter a list of numbers :").split(","))

print("Given list is :" ,numbers)

length=len(numbers)
print(length)

first_elememt=numbers[0]
last_element=numbers[length-1]

if (first_elememt==last_element):
    print("true")
else:
    print("false")



