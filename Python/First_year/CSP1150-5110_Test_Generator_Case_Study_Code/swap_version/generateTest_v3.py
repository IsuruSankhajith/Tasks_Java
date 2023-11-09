'''
    Version 3 of the "Test Generator" case study program from Module 5.
    This version can generate multiple tests instead of just one.
    
    See the Lecture 5 recording for pseudocode and discussion regarding
    the design and implementation of this program.
'''

import random

op = input('Addition or subtraction test? [enter "+" or "-"]: ')
qty = int(input('How many tests should be generated?: '))

for i in range(qty):
    if op == '+':
        print('\n\nAddition Test\n')
    elif op == '-':
        print('\n\nSubtraction Test\n')
        
    print('Name: __________\n\n')

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

