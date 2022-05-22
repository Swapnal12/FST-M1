def sum(numbers):
    sum=0
    for number in numbers:
        sum=sum+number
    return sum

	
List = [8, 57, 69, 82]
 

result = sum(List)
 

print("The sum of all the elements is: " + str(result))
