# Issue 14: Proof of Concept Application

## Goal
Validate the entire Mini-Spring-IoC framework by building a small, realistic "Demo" application that utilizes all features developed in previous milestones.

## Requirements
- Create a set of "business logic" classes (e.g., `UserService`, `PaymentService`, `NotificationService`).
- **Dependency Injection**:
    - `UserService` should depend on `PaymentService` and `NotificationService`.
    - Inject these dependencies via XML configuration.
- **Properties**:
    - Inject primitive values (e.g., `timeout`, `appVersion`, `apiKey`) into the services.
- **Lifecycle**:
    - Implement `InitializingBean` or use `init-method` to print "Service Starting..." logs.
    - Implement `DisposableBean` or use `destroy-method` to print "Service Stopping..." logs.
- **Post Processors**:
    - Register a simple `BeanPostProcessor` to log execution time or wrap beans (optional proxying check).

## Acceptance Criteria
- Create a `Main` class.
- Load `ClassPathXmlApplicationContext`.
- Retrieve `UserService`.
- Call a method like `userService.registerUser("alice")`.
- Expected console output shows:
    1. Bean creation logs.
    2. Initialization logs.
    3. Post-processor logs.
    4. "User Alice registered" (from the service method).
    5. Destruction logs on context close.
