#-----------------------------------------------------------------------
#Task 01
#-----------------------------------------------------------------------
#nums = [1,2,4,15]
#nums.insert(4,16)
#nums.index(16)
#nums.append(32)
#nums.sum()
#nums.reverse()
#print(nums)

#-----------------------------------------------------------------------
#02
#-----------------------------------------------------------------------
#text = 'concatenation'
#print(text[4])
#print(text[-3])
#print(text[0:3])
#print(text[3:6])
#print(text[7:-1])
#-----------------------------------------------------------------------
#03
#-----------------------------------------------------------------------
#for i in range(1,10):
#    print(i)


#-----------------------------------------------------------------------
#list=[1,2,3,4,5,6,7,8,9]
#for list in range(1,10):
#    print(i)
#-----------------------------------------------------------------------

#for i in range (2,25,2):
#    print(i)

#-----------------------------------------------------------------------
#Task 02
#-----------------------------------------------------------------------
#import random
#min = 0
#max = 10
#total =0
#number =0
#i=1
#while  i != 0:
#    number: int=  (random.randint(min,max))
#    print("Number",i," was :",number)
#    i +=1

#    if number == 0:
#        break;

#    total +=number
#print("The total is", total)

#=== RESTART: D:\ACBT\Programming Principles\workshops\workshop 3\Workshop3.py ==
#Number 1  was : 4
#Number 2  was : 10
#Number 3  was : 10
#Number 4  was : 7
#Number 5  was : 5
#Number 6  was : 0
#The total is 36
#>>>
#---------------------------------------------------------------------------------------------
#import random
#min = 0
#max = 10
#total =0
#number =0
#i=1
#while  i != 0:
#    number: int=  (random.randint(min,max))
#    print("Number",i," was :",number)
#    i +=1

#    if number == 7:
#        print("Lucky 7!")
#    elif number == 0:
#        break;

#    total +=number
#print("The total is", total)

#=== RESTART: D:\ACBT\Programming Principles\workshops\workshop 3\Workshop3.py ==
#Number 1  was : 8
#Number 2  was : 9
###Number 3  was : 9
#Number 4  was : 5
#Number 5  was : 3
#Number 6  was : 1
#Number 7  was : 8
#Number 8  was : 7
#Lucky 7!
#Number 9  was : 5
#Number 10  was : 6
#Number 11  was : 4
##Number 12  was : 2
#Number 13  was : 10
##Number 14  was : 6
#Number 15  was : 7
#Lucky 7!
#Number 16  was : 0
#The total is 99
#>>> 
#-----------------------------------------------------------------------
#Task 03
#-----------------------------------------------------------------------
import random

min = 1
max = 100
total=0
gusse =0
i=1

while i !=0:
    gusse : int = (random.randint(min,max))
    print("Enter your gusse :",gusse)
    i +=1

    if gusse <= 50:
        print("Too low")
    elif gusse <=100:
        print("Too high")
    elif gusse == 58:
        print("win")


print(i)
#-----------------------------------------------------------------------





















    

