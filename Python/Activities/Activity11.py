	
fruit_shop = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15
}

fruit=input("What are you looking for :").lower()

if(fruit in fruit_shop) :
    print("Fruit is available")

else:
    print("Fruit is not available")