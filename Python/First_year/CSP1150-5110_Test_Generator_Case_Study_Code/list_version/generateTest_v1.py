'''
    Version 1 of the "Test Generator" case study program from Module 5.
    
    See the Lecture 5 recording for pseudocode and discussion regarding
    the design and implementation of this program.
'''

import random

op = input('Addition or subtraction test? [enter "+" or "-"]: ')

if op == '+':
    print('\n\nAddition Test\n')
elif op == '-':
    print('\n\nSubtraction Test\n')
    
print('Name: __________\n\n')

for i in range(10):
    nums = [random.randint(0, 9), random.randint(0, 9)]

    if op == '-':
        nums.sort()

    print(nums[1], op, nums[0], '= ____\n')
