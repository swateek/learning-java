## **JUnit**

[Tutorial Here.](https://www.tutorialspoint.com/junit/)

    a unit test framework in Java, has played an important role in TDD.

    JUnit promotes the idea of "first testing then coding", which emphasizes on setting up the test data for a piece of code that can be tested first and then implemented.

    JUnit is used as a Regression Test Framework used by developers to implement unit testing in Java.

#### **Features of JUnit Framework**

**1. Fixtures** - is a fixed state of a set of objects used as a baseline for running tests. The purpose of a test fixture is to ensure that there is a well-known and fixed environment in which tests are run so that results are repeatable. Methods like setUp() and tearDown().

**2. Test Suites** - a test suite bundles a few unit test cases and runs them together. In JUnit, both @RunWith and @Suite annotation are used to run the suite test.

**3. Test Runners** - Test runner is used for executing the test cases.

**4. JUnit Classes** - JUnit classes are important classes, used in writing and testing JUnits. Some of which are Assert, TestCase, TestResult, etc.