# Issue 3: Implement Simple BeanFactory

## Goal
Create a default implementation of the `BeanFactory` that can register definitions and create beans.

## Requirements
- Class `DefaultListableBeanFactory` (or similar simple name).
- Use a `Map<String, BeanDefinition>` to store definitions.
- `getBean(name)` should:
    1. Retrieve `BeanDefinition`.
    2. Instantiate the class using reflection (`clazz.newInstance()`).
    3. Return the instance.
- Support Singleton scope (cache created beans in a `singletonObjects` map).

## Acceptance Criteria
- Test registering a simple service class.
- Test `getBean` returns a new instance (or singleton if implemented).
