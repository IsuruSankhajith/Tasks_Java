"""
File: testSelectionSort.py

Tests the Selection sort algorithm
"""

def SelectionSort(lyst):
    count = 0
    i=0
    while i<len(lyst)-1:     # Do n-1 search
        minIndex=i           # index: for the smallest
        j=i+1
        while j<len(lyst):   # start search 
            count +=1
            if lyst[j]<lyst[minIndex]:
                minIndex = j
            j += 1;
        #print(f'         ------Now search range: lyst[{i}]={lyst[i]} to the end: The smallest found is in lyst[{minIndex}] = {lyst[minIndex]}', end='\n')
        #print('         ------before swap:')
        #print(lyst)
        #if minIndex != i:
        #    print(f'         ------ swapping: value lyst[{minIndex}]= {lyst[minIndex]} will be swapped with value lyst[{i}]= {lyst[i]}')
        #else:
        #    print(f'         ------ The value lyst[{minIndex}]= {lyst[minIndex]} already in position, NO SWAP is needed!')
        if minIndex != i:
            swap(lyst, minIndex, i)
        #print(lyst)   
        i += 1
    print("Numbr of comparisons: ", count) 
       

def swap(lyst, i, j):
    """Exchanges the items at positions i and j."""
    # You could say lyst[i], lyst[j] = lyst[j], lyst[i]
    # but the following code shows what is really going on
    temp = lyst[i]
    lyst[i] = lyst[j]
    lyst[j] = temp


import random


def main(size = 100, sort = SelectionSort):
    lyst = []
    for count in range(size):
        lyst.append(random.randint(1, size*10 + 1))
    print(lyst)
    sort(lyst)
    print(lyst)

if __name__ == "__main__":
    main() 
