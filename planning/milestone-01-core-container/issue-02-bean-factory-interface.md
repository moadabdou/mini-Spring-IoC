# Issue 2: Create BeanFactory Interface

## Goal
Define the contract for the IoC container.

## Requirements
- Define interface `BeanFactory`.
- Method `Object getBean(String name)`.
- Method `void registerBeanDefinition(String name, BeanDefinition beanDefinition)`. (Or separate Registry interface, but keep it simple for now).

## Acceptance Criteria
- Interface compiles.
