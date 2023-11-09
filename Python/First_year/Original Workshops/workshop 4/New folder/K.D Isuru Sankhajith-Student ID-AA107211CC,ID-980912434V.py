#This programm for the playing dice game
#import random module
#import numpy module
import random
import numpy as np

#Constants for the minimum and maximum random numbers
MAX = 6
MIN = 2
k = 1
again_dice = 0 #creat a variable to control the loop
#create def function
def main():
    dice_welcome()
    dice_rules()

    #calculate play again and Exit
    play_dice = True
    while play_dice:

        get_score ()

        again_dice: str = input('Do you want to play again? (y/n) :')
        #if the user wants to do another one
        if again_dice == 'n':
            print('good bye')
            play_dice= False
#create dice dice processing function
def get_score():

    players= int(input('how many players are there(1..4)  :'))
    array = np.arange(players) #create numpy array type

    for r in range(5): #create for loop each player playing five rounds
        print('round ', str(k + r))
        # creat while loop genarate players
        i = 1
        while i <= players:
            dice_val = 0 #intitialize variable
            # print(input('Enter player '))
            dice_val = random.randint(MIN, MAX) #genarate random values assigned to 'dice_val' variable
            array[i - 1] = array[i - 1] + dice_val #'dice_val' variable values add array elements
            print('Rolling dice for player', i, ':', (dice_val))#print player roll dice values
            i = i + 1
    #find winner
    winner = 0 # intitialize variable
    for x in array:
        if x > winner:
            winner = x


    print(array) #Each player got score
    print(winner)
    result = np.where(array == winner) #
    a = result[0].astype(int) #
    print(a + 1)
    print("The winner is player", a + 1)

#print dice game login
def dice_welcome():
    print('################WELCOME################ \n\t'
          '        NASTY DICE GAME!              ')
#print dice game ruls
def dice_rules():
    print('* Each player rolls five dice ')
    print('* Each player get sum  ')
    print('  highs score win')
    print('* player wants to play again or ')
    print('  Exist game put it (y/n)')

main()
