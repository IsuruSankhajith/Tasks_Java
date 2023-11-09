marks =float(input('Enter the marks :'))
if marks >= 0 and marks <= 100:
    if marks >= 80:
        print('HD')
    elif marks >= 70:
        print('0')
    elif marks >= 60:
        print('CR')
    elif marks >= 50:
        print('C')
    else:
        print('Fail')
else:
    print('Invalid marks')
