# Issue 9: XML Bean Definition Reader

## Goal
Parse XML files to register beans.

## Requirements
- Class `XmlBeanDefinitionReader` implements `BeanDefinitionReader`.
- Parse XML structure:
  ```xml
  <bean id="foo" class="com.example.Foo">
      <property name="bar" value="baz"/>
      <property name="refBean" ref="otherBean"/>
  </bean>
  ```
- Convert XML tags to `BeanDefinition` and `PropertyValue`.

## Acceptance Criteria
- Create an XML file.
- Register beans by pointing reader to that XML.
- `getBean` works as expected.
