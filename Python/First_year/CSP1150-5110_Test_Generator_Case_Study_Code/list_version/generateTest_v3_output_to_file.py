'''
    Version 3 of the "Test Generator" case study program from Module 5.
    This version also implements the "Challenge Question" enhancement.
    
    See the Lecture 5 recording for pseudocode and discussion regarding
    the design and implementation of this program.
'''

import random

op = input('Addition or subtraction test? [enter "+" or "-"]: ')
qty = int(input('How many tests should be generated?: '))

file = open('output.txt', 'w')

for i in range(qty):
    if op == '+':
        print('\n\nAddition Test\n')
        file.write('\n\nAddition Test\n\n')
    elif op == '-':
        print('\n\nSubtraction Test\n')
        file.write('\n\nSubtraction Test\n\n')
        
    print('Name: __________\n\n\n')
    file.write('Name: __________\n\n\n')
    
    questions = []

    for i in range(10):
        while True:
            nums = [random.randint(0, 9), random.randint(0, 9)]

            if op == '-':
                nums.sort()

            if nums not in questions:
                questions.append(nums)
                break

        print(nums[1], op, nums[0], '= ____\n')
        file.write(str(nums[1]) + ' ' + op + ' ' + str(nums[0]) + ' = ____\n\n')

file.close()
print('\nTests saved in output.txt file.')
