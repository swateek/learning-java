## **Spring Framework**

[Tutorial Here.](https://howtodoinjava.com/java-spring-framework-tutorials/)
[Spring + Maven](https://mkyong.com/spring/quick-start-maven-spring-example/)

    Spring framework is an open source Java platform that provides comprehensive infrastructure support for developing robust Java applications very easily and very rapidly. 


#### **Advantages of Spring**

    1. POJO Based - Plain Old Java Objects means we don't need an EJB container product such as an application server but a simple web server can do the work.

    2. Modular - we can pick only a part of the entire framework, just what we want and nothing more.

    3. Easy to test, maintain and integrate with existing frameworks.

    4. Centralized Exception Handling - Spring provides a convenient API to translate technology-specific exceptions (thrown by JDBC, Hibernate, or JDO, for example) into consistent, unchecked exceptions.

    5. Transaction Management - Spring provides a consistent transaction management interface that can scale down to a local transaction (using a single database, for example) and scale up to global transactions (using JTA, for example).



#### **Inversion of Control (IoC) & Dependency Injection (DI)** 

[StackOverFlow Question](https://stackoverflow.com/questions/6550700/inversion-of-control-vs-dependency-injection)

    IoC is a generic term meaning rather than having the application call the methods in a framework, the framework calls implementations provided by the application.

    DI is a form of IoC, where implementations are passed into an object through constructors/setters/service lookups, which the object will 'depend' on in order to behave correctly.

    IoC without using DI, for example would be the Template pattern because the implementation can only be changed through sub-classing.


#### **Spring Beans**
    
    A Spring Bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. These beans are created with the configuration metadata that you supply to the container. 