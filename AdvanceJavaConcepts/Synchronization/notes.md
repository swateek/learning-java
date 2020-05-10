### Synchronization

[Synchronization in Java](https://www.geeksforgeeks.org/synchronized-in-java/)
[Static Synchronization vs Non-Static Synchronization](http://net-informations.com/java/cjava/sync.htm)

**Static Synchronization vs Non-Static Synchronization**

    Synchronization is the way used to protect access to resources that are accessed concurrently. A synchronized block of code can only be executed by one thread at a time. Synchronization in Java is basically an implementation of monitors.

    When synchronizing a non-static method, the monitor belongs to the instance.
    When synchronizing on a static method, the monitor belongs to the class.

    For non-static synchronized method memory is allocated multiple time whenever method is called.
    For static synchronized method, method is allocated only once at the time of class loading. Thus, while executing a static method, the whole class is blocked.