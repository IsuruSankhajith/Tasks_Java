"""
File: testBinarySearch.py

Test the binary search algorithm
"""
def binarySearch (target, a, left, right):
    #To find target in a[left…right]
    l, r = left, right
    while l <= r:
        m = (l+r)//2
        if target == a[m]:
            return m          #found, done
        elif target < a[m]:
            r = m - 1         #search left half
        else:
            l = m + 1         #search left half
    return -1                 #not found 


import random


def main( search = binarySearch):
  

    lyst1 = [3, 4, 5, 6, 9, 11, 12, 17, 19, 20, 22, 30, 31, 32, 45, 62, 77, 89, 228]   
    print("array=>: ", lyst1)
    target =11
    found = search(target, lyst1, 0, len(lyst1)-1)
    if found == -1:
        print("search unsuccessful...")
    else:
        print("target = ", target, " fount at position: ", found)
        
    target=input("input a target value to search from the array: ")
    found = search(int(target), lyst1, 0, len(lyst1)-1)
    if found == -1:
        print("search unsuccessful...")
    else:
        print("target = ", target, " found at position: ", found)
if __name__ == "__main__":
    main() 
