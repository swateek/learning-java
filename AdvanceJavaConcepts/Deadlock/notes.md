## Deadlocks

[Details on this link](https://howtodoinjava.com/java/multi-threading/writing-a-deadlock-and-resolving-in-java/)

    In CreateDeadLockExample.java, when you run the code. It will be hung and no logs will be printed on the console.

    Let's see how?

    Thread1 starts by holding a lock on "a" and after some seconds, requests a lock on "b".
    Thread2 starts by holding a lock on "b" and requests a lock on "a".

    How can we resolve this?

    If we look at the source of our deadlock problem, it is the pattern that we use in accessing the objects which causes the deadlock.

    In ResolveDeadLockExample.java, we change the order of accession which results in correcting the deadlock.

    Thread1 starts by holding a lock on "b" and after some seconds, requests a lock on "a".
    Thread2 also starts by holding a lock on "b" and then requests a lock on "a".

