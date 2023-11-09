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
            num1 = random.randint(0, 9)
            num2 = random.randint(0, 9)

            if op == '-':
                if num1 < num2:
                    num1, num2 = num2, num1

            nums = [num1, num2]

            if nums not in questions:
                questions.append(nums)
                break

        print(num1, op, num2, '= ____\n')
        file.write(str(num1) + ' ' + op + ' ' + str(num2) + ' = ____\n\n')

file.close()
print('\nTests saved in output.txt file.')
