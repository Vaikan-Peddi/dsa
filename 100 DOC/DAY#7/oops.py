# Author: Vaikan Peddi 
# Date: 3rd October 2023
# Description: Today, we will work on OOP in Python

class Animal:
    animalType = 'mammal' #This is the class variable which is equivalent to the static variable. As this variable belongs to the class and not to any specific object created.
    def __init__(self, name, legs): #The constructor function
        self.name = name
        self.legs = legs

    def describe(self):
        print("My name is {} and I have {} legs".format(self.name, self.legs))

class Dog(Animal): # This is the syntax for inheritance in python
    def __init__(self, name, legs, breed):
        super().__init__(name, legs)
        self.breed = breed
    
    def bark(self):
        print("Woof! Woof!")


dog = Dog('tommy', 4, 'St. Bernard')
dog.bark()

#In python, method overloading is not available but can be emulated using variable arguments.
