## Custom Exceptions

[Details are Here](https://howtodoinjava.com/java/exception-handling/best-practices-for-for-exception-handling/)

    Previously, we used to create custom exception classes by extending the base exception class. However, the new and better approach is using static inner classes.

    Traditionally, we create a DBException class by extending Exception class. Now, every time we are caught in a situation where there is a need to throw a database related exception, we usually create an instance of DBException, put some information in form of the message and throw it.

    The reasons for exception could be multiple, so the DBException class object we used to create might not provide us enough information. Hence, the new approach.

**Advantages of using static inner classes**

1. Even if the developer's message is vague, we can still figure out from the class structure the details about the error.

2. Exceptional scenarios can be handled using instance-of comparison.

3. No need for common exception message for all exceptions. We can go granular.

4. Easy to test.

5. Logging is more meaningful and informative.