package com.mini.spring.ioc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanDefinition {

    private Class<?> beanClass;

    private String scope = "singleton";

    private boolean lazyInit = false;

    private List<String> constructorArgumentBeanNames = new ArrayList<>();

    private Map<String, Object> propertyValues = new HashMap<>();

    public BeanDefinition(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public Class<?> getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    public List<String> getConstructorArgumentBeanNames() {
        return constructorArgumentBeanNames;
    }

    public void addConstructorArgument(String beanName) {
        this.constructorArgumentBeanNames.add(beanName);
    }

    public Map<String, Object> getPropertyValues() {
        return propertyValues;
    }

    public void addPropertyValue(String propertyName, Object value) {
        this.propertyValues.put(propertyName, value);
    }
    
}