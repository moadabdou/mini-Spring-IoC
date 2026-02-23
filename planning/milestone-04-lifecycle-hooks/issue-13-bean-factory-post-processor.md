# Issue 13: Bean Factory Post Processor

## Goal
Allow modification of bean definitions *before* beans are created.

## Requirements
- Interface `BeanFactoryPostProcessor`.
    - `postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)`.
- `ApplicationContext` implementation needs to execute these processors after loading definitions but before bean instantiation.
- Example use case: PropertyPlaceholderConfigurer (replacing `${db.url}` with value from file).

## Acceptance Criteria
- Create a processor that modifies a bean property value dynamically.
- Verify the injected value is the modified one.
