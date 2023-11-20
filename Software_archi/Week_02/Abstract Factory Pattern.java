Abstract Factory Pattern:

Intent: The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. It is used to ensure that the created objects are compatible and can work together.
Key Components:
Abstract Factory: Declares the interface for creating product objects.
Concrete Factory: Implements the Abstract Factory interface and creates a family of related products.
Abstract Product: Declares the interface for a type of product object.
Concrete Product: Implements the Abstract Product interface and defines a specific product object.
Client: Uses the Abstract Factory and Abstract Product interfaces to create families of related or dependent objects.
# Abstract Product
class Shape:
    def draw(self):
        pass

# Concrete Products
class Circle(Shape):
    def draw(self):
        print("Drawing Circle")

class Square(Shape):
    def draw(self):
        print("Drawing Square")

# Abstract Factory
class ShapeFactory:
    def createShape(self):
        pass

# Concrete Factories
class CircleFactory(ShapeFactory):
    def createShape(self):
        return Circle()

class SquareFactory(ShapeFactory):
    def createShape(self):
        return Square()

# Client
circle_factory = CircleFactory()
square_factory = SquareFactory()

circle = circle_factory.createShape()
square = square_factory.createShape()

circle.draw()  # Output: "Drawing Circle"
square.draw()  # Output: "Drawing Square"
