# Issue 12: Lifecycle Callbacks (Init/Destroy)

## Goal
Support initialization and destruction methods.

## Requirements
- Interface `InitializingBean` (`afterPropertiesSet`).
- Interface `DisposableBean` (`destroy`).
- XML support for `init-method` and `destroy-method` attributes.
- Update `BeanFactory` to call these methods during creation/destruction (shutdown hook).

## Acceptance Criteria
- Verify init methods are called after property injection.
- Verify destroy methods are called when context closes.
