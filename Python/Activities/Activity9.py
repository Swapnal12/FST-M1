list1 = [18,23,15,68,19]
list2 = [14,18,46,17,19]
 

print("First List ", list1)
print("Second List ", list2)
 

List3 = []

for num in list1:
    if(num%2!=0):
        List3.append(num)

for num in list2:
    if(num%2==0):
        List3.append(num)

print("result List is:")
print(List3)