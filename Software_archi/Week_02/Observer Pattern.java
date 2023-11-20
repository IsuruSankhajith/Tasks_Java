Observer Pattern:

Intent: The Observer Pattern is used to define a one-to-many dependency between objects so that when one object changes state, all its dependents (observers) are notified and updated automatically.
Key Components:
Subject: Maintains a list of observers and notifies them of state changes.
Observer: Defines an interface for objects that should be notified of changes in the subject.
ConcreteSubject: The actual object being observed, which can change state.
ConcreteObserver: Implements the Observer interface and is notified of changes in the ConcreteSubject.

# Observer
class Observer:
    def update(self, temperature, humidity):
        pass

# Concrete Observer
class WeatherDisplay(Observer):
    def update(self, temperature, humidity):
        print(f"Current Temperature: {temperature}, Humidity: {humidity}")

# Subject
class Subject:
    def __init__(self):
        self.observers = []

    def addObserver(self, observer):
        self.observers.append(observer)

    def removeObserver(self, observer):
        self.observers.remove(observer)

    def notifyObservers(self, temperature, humidity):
        for observer in self.observers:
            observer.update(temperature, humidity)

# Concrete Subject
class WeatherStation(Subject):
    def setWeather(self, temperature, humidity):
        self.notifyObservers(temperature, humidity)

# Client
display1 = WeatherDisplay()
display2 = WeatherDisplay()

weather_station = WeatherStation()
weather_station.addObserver(display1)
weather_station.addObserver(display2)

weather_station.setWeather(25, 60)
