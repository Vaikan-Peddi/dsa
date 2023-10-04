# Understanding the usage of python class' super() method used while inheritance

class ClassA:
    def method(self):
        print("Method from ClassA")

class ClassB(ClassA):
    def method(self):
        super().method()
        print("Method from ClassB")

class ClassC:
    def method(self):
        print("Method from ClassC")

class ClassD(ClassB, ClassC):
    def method(self):
        super().method()
        print("Method from ClassD")

# Create an instance of ClassD
d = ClassD()

# Call the method from ClassD, which uses super() to call the method from ClassB and ClassA
d.method()

#So basically the super() function keeps checking all the parent classes in the multiple inheritance model until the function is found in the order the classes are specified for the inheritance
