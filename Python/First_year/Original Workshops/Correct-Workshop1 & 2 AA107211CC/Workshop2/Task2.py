print('i for centemetrs to inches\n2 for inches to centimeter ')
choice =int(input('--->'))
if choice ==1:
    cms = float (input('Enter the centimeters : '))
    inches =cms*0.393
    print(cms,'centimeter m',inches,'inches')
elif   choice ==2:
    inches= float (input('Enter the inches : '))
    cms = inches*2.54
    print(cms,'inches =',cms,'centimeters' )
else:
    print('invalid choice ')

