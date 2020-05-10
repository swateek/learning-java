### Java Concurrency

[Details are on this Link](https://winterbe.com/posts/2015/04/07/java8-concurrency-tutorial-thread-executor-examples/)

**Executors**
	
	The Concurrency API introduces the concept of an ExecutorService as a higher level replacement for working with threads directly. Executors are capable of running asynchronous tasks and typically manage a pool of threads, so we don't have to create new threads manually. All threads of the internal pool will be reused under the hood for revenant tasks, so we can run as many concurrent tasks as we want throughout the life-cycle of our application with a single executor service.

	An ExecutorService provides two methods for that purpose: shutdown() waits for currently running tasks to finish while shutdownNow() interrupts all running tasks and shut the executor down immediately.

	Supports batch with invokeAll() and invokeAny()
	invokeAll() accepts a list of callables, and returns a list of Futures.
	invokeAny() also accepts a list, return the Future object of the first callable that terminates.

**Callables & Future**

	Callables are functional interfaces just like runnables but instead of being void they return a value.
	Callables can be submitted to executor services just like runnables.
	submit() doesn't wait until the task completes, hence the executor service cannot return the result of the callable directly. Instead the executor returns a special result of type Future which can be used to retrieve the actual result at a later point in time.

	Future.get() blocks the current thread and waits until the callable completes before returning the actual result. Also takes a timeout parameter after which it exits the wait for result and throws a "TimeoutException"
	Future.isDone() check if the future has already finished execution.


**ScheduledExecutors**

	A ScheduledExecutorService is capable of scheduling tasks to run either periodically or once after a certain amount of time has elapsed.