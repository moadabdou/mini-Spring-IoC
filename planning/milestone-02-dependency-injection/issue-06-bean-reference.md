# Issue 6: Bean Reference Injection

## Goal
Support injecting one bean into another (Collaboration).

## Requirements
- Class `BeanReference` to act as a placeholder for a dependency.
- Update `applyPropertyValues`:
    - Check if a property value is an instance of `BeanReference`.
    - If so, resolve it by calling `getBean(ref.getName())` (recursive resolution).
    - Inject the resolved real bean.

## Acceptance Criteria
- Define Bean A and Bean B.
- Bean A depends on Bean B.
- `getBean("beanA")` should return a fully populated A with B injection.
