"""
File: LinearSearch.py

Test the linear search algorithm
"""


def linearSearch (target, a, left, right):
    #find target in a[left…right]

    for i in range(right-left+1):
        if int(target) == (a[left+i]):
            return left+i
        else:
            print (a[i])
    return -1
    
import random


def main(size = 20, search = linearSearch):
    lyst = []
    for count in range(size):
        lyst.append(random.randint(1, size + 1))
    print("array=>: ", lyst)
    target =7
    found = search(target, lyst, 0, len(lyst)-1)
    if found == -1:
        print("search unsuccessful...")
    else:
        print("target = ", target, " found at position: ", found)

    lyst1 = [22, 12, 3, 5, 77, 89, 9, 6, 17, 228, 45, 62, 31, 4, 19, 20, 32, 30, 11, 10]   
    print("array=>: ", lyst1)
    target =11
    found = search(target, lyst1, 0, len(lyst1)-1)
    if found == -1:
        print("search unsuccessful...")
    else:
        print("target = ", target, " found at position: ", found)
        
    target=input("input a target value to search fron the array: ")
    found = search(target, lyst1, 0, len(lyst1)-1)
    if found == -1:
        print("search unsuccessful...")
    else:
        print("target = ", target, " found at position: ", found)

if __name__ == "__main__":
    main() 
