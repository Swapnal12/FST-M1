user1=input("What is player 1's name :")
user2=input("What is player 2's name :")

user1_answer=input(user1 + ", do you want to choose rock, paper or scissors ?").lower()
user2_answer=input(user2 + ", do you want to choose rock, paper or scissors ?").lower()

if user1_answer==user2_answer:
    print("It is a tie!")
elif user1_answer == 'rock':
    if user2_answer == 'scissors':
        print("Rock wins")
    else:
        print("Paper wins")
elif user1_answer == 'scissors':
    if user2_answer == 'paper':
        print("scissors wins")
    else:
        print("Rock wins")
elif user1_answer == 'paper':
    if user2_answer == 'rock':
        print("Paper wins")
    else:
        print("Scissor wins")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")


