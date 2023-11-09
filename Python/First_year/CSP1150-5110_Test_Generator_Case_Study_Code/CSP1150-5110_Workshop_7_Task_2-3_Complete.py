def checkPassword(pword):
    shortEnough = False
    longEnough = False
    hasUpper = False
    hasLower = False
    hasNumber = False
    hasSpecial = False

    specialChars = '\'~!#$%^*()_+-={}|[]\\:<>?,./'

    if len(pword) <= 16: # check maximum length
        shortEnough = True
    else:
        return False

    if len(pword) >= 8: # check minimum length
        longEnough = True
    else:
        return False

    for char in pword:
        if not hasUpper and char.isupper(): # check for uppercase
            hasUpper = True

        if not hasLower and char.islower(): # check for lowercase
            hasLower = True
    
        if not hasNumber and char.isdigit(): # check for digit
            hasNumber = True
            
        if not hasSpecial and char in specialChars: # check for special character
            hasSpecial = True

        # return True if all variables are True
        if shortEnough and longEnough and hasUpper and hasLower and hasNumber and hasSpecial:
            return True

    # if we haven't returned True by now, return False
    return False


password = input('Enter your password: ')

if checkPassword(password):
    print('Your password is valid.')
else:
    print('Your password is not valid.')
