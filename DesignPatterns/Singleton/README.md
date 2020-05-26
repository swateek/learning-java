## Singleton Design Pattern

[Details Here.](https://howtodoinjava.com/design-patterns/creational/singleton-design-pattern-in-java/)

Singleton pattern is a design solution where an application wants to have one and only one instance of any class, in all possible scenarios without any exceptional condition. 

### Let's start with the kind of singletons:

1. **Singleton with Eager Initialization** -
    an instance of the class is created at runtime, irrespective of it being used ever or not.

2. **Singleton with Lazy Initialization** - 
    it restricts the creation of the instance until it is requested for first time
    be sure to use “volatile” keyword with instance variable otherwise you can run into an out of order write error scenario, where reference of an instance is returned before actually the object is constructed i.e. JVM has only allocated the memory and constructor code is still not executed. In this case, your other thread, which refers to the uninitialized object may throw null pointer exception and can even crash the whole application.

3. **Singleton with Static Block Initialization** -
    as per the class loading sequence, static blocks are executed during the loading of a class, even before the constructor is called. 
    This has a drawback.
    Suppose there are 5 static fields in a class and the application code needs to access only 2 or 3, for which instance creation is not required at all. If we use this static initialization, we will have one instance created though it is required or not.

4. **Singleton with Bill Pugh solution** -
    Bill Pugh was main force behind the java memory model changes. 
    His principle “Initialization-on-demand holder idiom” also uses the static block idea, but in a different way. It suggest to use static inner class.
    **(IS A RECOMMENDED SOLUTION)**

5. **Singleton using ENUM**
    ENUM in Java provide thread safety and gurantee of a single instance.

6. **Add readResolve() to Singleton object**
    Let’s say your application is distributed and it frequently serializes objects into the file system, only to read them later when required. 
    Please note that de-serialization always creates a new instance. 
    we need to include a readResolve() method in our DemoSingleton class. This method will be invoked when you will de-serialize the object. Inside of this method, you must return the existing instance to ensure a single instance application wide.

7. **Complete Implementation (FinalSingletonExample.java)**

## Singleton - Double Check Locking

[Details Here.](https://www.baeldung.com/java-singleton-double-checked-locking)

This pattern reduces the number of lock acquisitions by simply checking the locking condition beforehand. As a result of this, there's usually a performance boost.

Even though Singleton is thread safe, each time we want to get the instance of our singleton, we need to acquire a potentially unnecessary lock. To fix that, we could instead start by verifying if we need to create the object in the first place and only in that case we would acquire the lock.