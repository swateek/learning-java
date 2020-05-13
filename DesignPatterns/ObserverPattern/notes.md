## Observer Design Pattern

[Details are Here.](https://howtodoinjava.com/design-patterns/behavioral/observer-design-pattern/)

    Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. It is also referred to as the publish-subscribe pattern.

    A observer object can register or unregister from subject at any point of time. It helps is making the objects objects loosely coupled.

### Details?

    when you have a design a system where multiple entities are interested in any possible update to some particular second entity object, we can use the observer pattern.

    Application creates the concrete subject object. All concrete observers register themselves to be notified for any further update in the state of subject. As soon as the state of subject changes, subject notifies all the registered observers and the observers can access the updated state and act accordingly.

### Design Participants

-  **Subject** -  interface or abstract class defining the operations for attaching and de-attaching observers to the subject.

- **Concrete Subject** - concrete Subject class. It maintain the state of the object and when a change in the state occurs it notifies the attached Observers.

- **Observer** - interface or abstract class defining the operations to be used to notify this object.

- **Concrete Observer** - concrete Observer implementations.