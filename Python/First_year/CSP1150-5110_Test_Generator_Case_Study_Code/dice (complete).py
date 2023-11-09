import random # we'll need the random module to roll the dice

class DicePile:

    def __init__(self, initQuantity, initSides): # constructor
        self.setQuantity(initQuantity)
        self.setSides(initSides)
        self.__rollCount = 0
        self.rolled = False


    def __str__(self): # generate a string representation of the object
        if self.rolled:
            resultString = str(self.__results) 
        else:
            resultString = 'not rolled' 

        dicescription = self.dicescription()
        rollCountString = ' (roll count: ' + str(self.__rollCount) + ')'
        return dicescription + ': ' + resultString + rollCountString


    def roll(self): # roll the dice
        self.__rollCount = self.__rollCount + 1
        self.rolled = True
        self.__results = [] # set results to empty list

        for i in range(self.__quantity): # generate random numbers and add to results list
            self.__results.append(random.randint(1, self.__sides))


    def maxTotal(self): # get the maximum possible total of a roll
        return self.__quantity * self.__sides
     

    def getAverage(self): # get the average of the results
        if self.rolled:
            return sum(self.__results) / self.__quantity
        else:
            raise AttributeError('dice have not been rolled')
        

    def sortResults(self): # sort the results
        if self.rolled:
            self.__results.sort()
        else:
            raise AttributeError('dice have not been rolled')
        

    def dicescription(self): # get the "dicescription"
        return str(self.__quantity) + 'd' + str(self.__sides)

    def getResults(self): # get results list (None if not rolled)
        return self.__results

    def getQuantity(self): # get quantity attribute
        return self.__quantity

    def getSides(self): # get sides attribute
        return self.__sides

    def getRollCount(self): # get rollCount attribute
        return self.__rollCount


    def setQuantity(self, newQuantity): # set quantity attribute
        if int(newQuantity) < 1:
            raise ValueError('dice quantity cannot be less than 1')
        else:
            self.__quantity = int(newQuantity)
            self.__results = None
            self.rolled = False

    def setSides(self, newSides): # set sides attribute
        if int(newSides) < 2:
            raise ValueError('dice sides cannot be less than 2')
        else:
            self.__sides = int(newSides)
            self.__results = None
            self.rolled = False



