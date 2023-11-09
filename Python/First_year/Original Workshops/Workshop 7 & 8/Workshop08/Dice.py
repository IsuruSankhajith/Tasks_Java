import random
class DicePile:

    def __init__(self, initQuantity, initSides):
        self.setQuantity(initQuantity)
        self.setSides(initSides)
        self.__rollCount = 0
        self.rolled = False

    def __str__(self):
        if self.rolled:
            resultString = str(self.__results)
        else:
            resultString = 'not rolled'

        dicescription = self.dicescription()
        rollCountString = ' (roll count: ' + str(self.__rollCount) + ')'
        return dicescription + ': ' + resultString + rollCountString

    def roll(self):  # roll the dice
        self.__rollCount = self.__rollCount + 1
        self.rolled = True
        self.__results = []

        for i in range(self.__quantity):
            self.__results.append(random.randint(1, self.__sides))

    def maxTotal(self):
        return self.__quantity * self.__sides

    def getAverage(self):
        if self.rolled:
            return sum(self.__results) / self.__quantity
        else:
            raise AttributeError('dice have not been rolled')

    def sortResults(self):
        if self.rolled:
            self.__results.sort()
        else:
            raise AttributeError('dice have not been rolled')

    def dicescription(self):
        return str(self.__quantity) + 'd' + str(self.__sides)

    def getResults(self):
        return self.__results

    def getQuantity(self):
        return self.__quantity

    def getSides(self):
        return self.__sides

    def getRollCount(self):
        return self.__rollCount

    def setQuantity(self, newQuantity):
        if int(newQuantity) < 1:
            raise ValueError('dice quantity cannot be less than 1')
        else:
            self.__quantity = int(newQuantity)
            self.__results = None
            self.rolled = False

    def setSides(self, newSides):  
        if int(newSides) < 2:
            raise ValueError('dice sides cannot be less than 2')
        else:
            self.__sides = int(newSides)
            self.__results = None
            self.rolled = False



