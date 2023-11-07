"""
File: testMergeSort.py

Tests the Merge sort algorithm
"""



def mergeSort(lyst):
    # lyst            list to be sorted
    # copyBuffer      temporary space needed during merge
    count = 0      #initialise count for No of Comparisons
    copyBuffer = [None]*(len(lyst))
    count = mergeSortHelper(lyst, copyBuffer, 0, len(lyst)-1)
    return count

def mergeSortHelper(lyst, copyBuffer, low, high):
    # lyst            list to be sorted
    # copyBuffer      temporary space needed during merge
    # high, low       bounds of sublist
    # middle          midpoint of sublist
    count = 0         #initialise count for No of comparisons
    if low <high:
        middle = (low+high)//2
        print ("low, middle, high = ", low, middle, high)
        count += mergeSortHelper(lyst, copyBuffer, low, middle)
        count += mergeSortHelper(lyst, copyBuffer, middle+1, high)
        print ("lyst - copyBuffer =>", lyst, "===", copyBuffer)
        count += merge(lyst, copyBuffer, low, middle, high)
    return count

def merge(lyst, copyBuffer, low, middle, high):
    # lyst            list to be sorted
    # copyBuffer      temporary space needed during merge
    # low             beginning of 1st sorted sublist
    # middle          end of 1st sorted sublist
    # middle +1       beginning of 2nd sorted sublist
    # high            end of 2nd sorted sublist

    #initialize i1 and i2 to the 1st items in each sublist
    i1=low
    i2=middle+1
    
    count = 0         #initialise count for No of comparisons 
    #interleave  items from the sublists into the
    #copyBuffer in such a way that order is maintained.
    for i in range(low, high+1):
        if i1>middle:
            copyBuffer[i]=lyst[i2] # 1st sublist exhausted
            i2 +=1
        elif i2>high:
            copyBuffer[i] = lyst[i1] # 2nd sublist exhausted
            i1 +=1
        elif lyst[i1]<lyst[i2]:
            count +=1
            copyBuffer[i] = lyst[i1] # item in 1st sublist
            i1 +=1            
        else:                 # lyst[i1]>=lyst[i2]
            count +=1
            copyBuffer[i] = lyst[i2] # item in 2nd sublist  
            i2 +=1
    for i in range(low, high+1):     # copy sorted items back to         
        lyst[i] = copyBuffer[i]      # proer position in lyst
    return count
        
    
import random


def main(size = 10, sort = mergeSort):
    lyst = []
    for count in range(size):
        lyst.append(random.randint(1, (size + 1)*10))
    print(lyst)
    count =0
    count = sort(lyst)
    print(lyst)
    print ("Num of comparisons = "+ str(count))
    
    lyst1 = [22, 12, 3, 5, 77, 89, 9, 6, 17, 228, 45, 62, 31, 4, 19, 20, 32, 30, 11]   
    print(lyst1)
    count = sort(lyst1)
    print ("Num of comparisons = "+ str(count))
    print(lyst1)

if __name__ == "__main__":
    main() 
