'''
    Version 3 of the "Test Generator" case study program from Module 5.
    This version also implements the "Challenge Question" enhancement.
    
    See the Lecture 5 recording for pseudocode and discussion regarding
    the design and implementation of this program.
'''

import random

# this function receives a min and max number and an operator, and uses them
# to generate two numbers (sorting them if needed) before returning them
# the function is useful since we need to do this in two parts of the program
def generateNums(minNum, maxNum, operator):
    nums = [random.randint(minNum, maxNum), random.randint(minNum, maxNum)]

    if operator == '-':
        nums.sort()

    return nums



op = input('Addition or subtraction test? [enter "+" or "-"]: ')
challenge = input('Make the final question a challenge? [enter "y" or "n"]: ')
qty = int(input('How many tests should be generated?: '))

for i in range(qty):
    if op == '+':
        print('\n\nAddition Test\n')
    elif op == '-':
        print('\n\nSubtraction Test\n')
        
    print('Name: __________\n\n')

    questions = []

    for i in range(10):
        if i == 9 and challenge == 'y':

            nums = generateNums(10, 20, op)

            print('Challenge question - do your best!')
            print(nums[1], op, nums[0], '= ____\n')
        else:
            while True:
                nums = generateNums(0, 9, op)

                if nums not in questions:
                    questions.append(nums)
                    break

            print(nums[1], op, nums[0], '= ____\n')
