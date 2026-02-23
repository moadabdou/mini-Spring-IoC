# Issue 11: Bean Post Processor

## Goal
Allow modification of beans before/after initialization.

## Requirements
- Interface `BeanPostProcessor`.
    - `postProcessBeforeInitialization(Object bean, String beanName)`
    - `postProcessAfterInitialization(Object bean, String beanName)`
- `BeanFactory` needs to support registering BPPs.
- `BeanFactory` applies BPPs during bean creation.

## Acceptance Criteria
- Create a custom BPP (e.g., logging).
- Verify it runs for every bean created.
