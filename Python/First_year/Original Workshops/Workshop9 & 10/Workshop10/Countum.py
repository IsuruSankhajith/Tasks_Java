
def countNum(start, end, num):
    if type(start) != int or type(end) != int or type(num) != int:
        raise TypeError('all parameters must be integers')

    if num < 0:
        raise ValueError('num parameter must be a positive integer')

    if start > end:
        raise ValueError('start parameter must be less than end parameter')

    count = 0

    for i in range(start, end + 1):
        if str(num) in str(i):
            count = count + 1

    return count
