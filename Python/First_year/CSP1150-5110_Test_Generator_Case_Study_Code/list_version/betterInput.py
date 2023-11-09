# inputChoice prompts for input and only accepts responses from a provided list
def inputChoice(prompt, choices):
    while True:
        response = input(prompt)

        if response not in choices:            
            print('Invalid choice.')
            continue

        return response


# inputInt prompts for input, converts to int and checks min and max
# if there is an error converting or with the min or max, it re-prompts for input
def inputInt(prompt, errorMessage = 'Invalid input - Try again.',
             minValue = None, maxValue = None):
    
    while True:
        value = input(prompt)

        try:
            numResponse = int(value)
           
        except ValueError:
            print(errorMessage)
            continue

        if minValue is not None and numResponse < minValue:
            print('Minimum of', minValue, 'permitted.')
            continue
            
        if maxValue is not None and numResponse > maxValue:
            print('Maximum of', maxValue, 'permitted.')
            continue
        
        return numResponse
