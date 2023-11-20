Iterator Pattern:

Intent: The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation. It involves separating the traversal of an object from its actual structure.
Key Components:
Iterator: Defines an interface for accessing elements in a collection.
ConcreteIterator: Implements the Iterator interface and keeps track of the current position in the traversal.
Aggregate: Defines an interface for creating an Iterator object.
ConcreteAggregate: Implements the Aggregate interface and provides an Iterator for its elements.
Iterator Pattern:

Example: Consider a collection class ListCollection that stores a list of elements. You can implement an iterator to traverse the elements without exposing the internal representation.
# Iterator
class Iterator:
    def __init__(self, collection):
        self.collection = collection
        self.index = 0

    def next(self):
        if self.index < len(self.collection):
            item = self.collection[self.index]
            self.index += 1
            return item
        else:
            return None

# Aggregate
class ListCollection:
    def __init__(self):
        self.elements = []

    def addElement(self, element):
        self.elements.append(element)

    def createIterator(self):
        return Iterator(self.elements)

# Client
collection = ListCollection()
collection.addElement("Item 1")
collection.addElement("Item 2")
iterator = collection.createIterator()

while True:
    item = iterator.next()
    if item:
        print(item)
    else:
        break
