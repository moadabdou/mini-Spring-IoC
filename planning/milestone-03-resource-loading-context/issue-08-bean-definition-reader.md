# Issue 8: Bean Definition Reader

## Goal
Decouple defining beans from the registry.

## Requirements
- Interface `BeanDefinitionReader`.
- Method `loadBeanDefinitions(Resource resource)`.
- Method `loadBeanDefinitions(String location)`.
- Holds a reference to a `BeanDefinitionRegistry` (the factory).

## Acceptance Criteria
- Reader can take a generic resource and assumes it contains definitions (format specific in next step).
