Adapter Pattern:

Intent: The Adapter Pattern is used to allow the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code.
Key Components:
Target: The interface that the client interacts with.
Adapter: A class that implements the Target interface and delegates the calls to an Adaptee.
Adaptee: The existing class that needs to be adapted.

# Legacy System
class LegacySystem:
    def legacyRequest(self):
        return "Legacy Request"

# New System Interface
class NewSystemInterface:
    def newRequest(self):
        pass

# Adapter
class Adapter(NewSystemInterface):
    def __init__(self, legacy_system):
        self.legacy_system = legacy_system

    def newRequest(self):
        return self.legacy_system.legacyRequest()

# Client
legacy_system = LegacySystem()
adapter = Adapter(legacy_system)
result = adapter.newRequest()
print(result)  # Output: "Legacy Request"
