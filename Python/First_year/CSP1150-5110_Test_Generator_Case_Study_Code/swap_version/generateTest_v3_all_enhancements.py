'''
    Version 3 of the "Test Generator" case study program from Module 5.
    This version implements all of the enhancements listed in the lecture.
    
    See the Lecture 5 recording for pseudocode and discussion regarding
    the design and implementation of this program.
'''

import random
import betterInput

# this function receives a min and max number and an operator, and uses them
# to generate two numbers (sorting them if needed) before returning them
# the function is useful since we need to do this in two parts of the program
def generateNums(minNum, maxNum, operator):
    num1 = random.randint(minNum, maxNum)
    num2 = random.randint(minNum, maxNum)

    if operator == '-':
        if num1 < num2:
                num1, num2 = num2, num1

    nums = [num1, num2]

    return nums



op = betterInput.inputChoice('Addition or subtraction test? [enter "+" or "-"]: ', ('+','-'))
challenge = betterInput.inputChoice('Make the final question a challenge? [enter "y" or "n"]: ', ('y', 'n'))
qty = betterInput.inputInt('How many tests should be generated?: ', minValue = 1)

file = open('output.txt', 'w')

for i in range(qty):
    if op == '+':
        print('\n\nAddition Test\n')
        file.write('\n\nAddition Test\n\n')
    elif op == '-':
        print('\n\nSubtraction Test\n')
        file.write('\n\nSubtraction Test\n\n')
        
    print('Name: __________\n\n')
    file.write('Name: __________\n\n\n')

    questions = []

    for i in range(10):
        if i == 9 and challenge == 'y':

            nums = generateNums(10, 20, op)

            print('Challenge question - do your best!')
            print(nums[0], op, nums[1], '= ____\n')
            file.write('Challenge question - do your best!\n')
            file.write(str(nums[0]) + ' ' + op + ' ' + str(nums[1]) + ' = ____\n\n')
        else:
            while True:
                nums = generateNums(0, 9, op)

                if nums not in questions:
                    questions.append(nums)
                    break

            print(nums[0], op, nums[1], '= ____\n')
            file.write(str(nums[0]) + ' ' + op + ' ' + str(nums[1]) + ' = ____\n\n')

file.close()
print('\nTests saved in output.txt file.')
