"""
File: testInsertionSort.py

Tests the Insertion sort algorithm
"""

def InsertionSort(lyst):
    i=1                               # starting point to be inserted
    #comparison_count=0
    while i<len(lyst):                # Do n-1 insertion
        itemToInsert = lyst[i]  
        j=i-1
        while j>=0:                   # start search
            #comparison_count +=1
            if itemToInsert <lyst[j]:
                lyst[j+1] = lyst[j]   #Shift right
                j -= 1
            else:
                break                 # found a index to insert 
        lyst[j+1]= itemToInsert       # insert 
        i += 1
    #print(f'\n  - Total number of comparisons = {comparison_count}', end = '\n\n')

import random


def main(size = 20, sort = InsertionSort):
    lyst = []
    for count in range(size):
        lyst.append(random.randint(1, size *10  + 1))
    print(lyst)
    sort(lyst)
    print(lyst)

if __name__ == "__main__":
    main() 
