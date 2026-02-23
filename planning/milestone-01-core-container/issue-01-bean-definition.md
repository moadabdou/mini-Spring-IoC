# Issue 1: Define BeanDefinition

## Goal
Create the core `BeanDefinition` class which holds the metadata for a bean.

## Requirements
- Should store the `Class` object of the bean.
- Should store property values (initially empty, to be used later).
- Should be a simple POJO.

## Acceptance Criteria
- Unit tests verify that a `BeanDefinition` can be instantiated with a class.
