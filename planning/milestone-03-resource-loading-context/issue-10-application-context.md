# Issue 10: Application Context

## Goal
Create the central interface for the Spring application.

## Requirements
- Interface `ApplicationContext` extends `BeanFactory`.
- Class `ClassPathXmlApplicationContext`.
- Constructor should:
    1. Create `DefaultListableBeanFactory`.
    2. Create `XmlBeanDefinitionReader`.
    3. Load definitions from provided path.
    4. Refresh context (prepare beans).

## Acceptance Criteria
- User can start app with `new ClassPathXmlApplicationContext("application.xml")`.
