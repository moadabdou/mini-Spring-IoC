# Issue 5: Setter Injection

## Goal
Populate bean properties after instantiation.

## Requirements
- Update `BeanFactory.getBean()` workflow:
    1. Instantiate bean.
    2. *New Step*: `applyPropertyValues(bean, beanDefinition)`.
- Use reflection to find setter methods or direct field access to set values.

## Acceptance Criteria
- Verify a bean with simple fields (String, int) is populated correctly after `getBean`.
