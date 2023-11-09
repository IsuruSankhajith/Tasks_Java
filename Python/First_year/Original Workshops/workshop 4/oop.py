class car():
    def __init__(self,model,price,year):
        self.model=model
        self.price=price
        self.year=year

    def price_inc(self):
         self.price=int(self.price*1.5)

class supercar(car):
    pass
honda=supercar('izuu',20000,2012)
tata=supercar('fuzuu',40000,1012)

honda.cc=1500

print(help(honda))

#honda.price_inc()
#print(honda.price)
