# Let us understand and look into Polymorphism: 
#   The ability for different classes to have the same function name. 
#   Or the process of method overriding.

class Animal:
    def speak(self):
        print('parent')

class Dog(Animal):
    def speak(self):
        print('child')

a = Dog()
a.speak()
Animal.speak(a)