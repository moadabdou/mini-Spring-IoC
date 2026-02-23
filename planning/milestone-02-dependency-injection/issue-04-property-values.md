# Issue 4: PropertyValues Implementation

## Goal
Create structures to hold property injection data.

## Requirements
- Class `PropertyValue` (holds `name` and `value`).
- Class `PropertyValues` (holds a list of `PropertyValue`).
- Update `BeanDefinition` to include a `PropertyValues` field.

## Acceptance Criteria
- `BeanDefinition` can now store properties to be injected.
