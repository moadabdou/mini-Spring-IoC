package com.mini.spring.ioc;

import java.util.HashMap;
import java.util.Map;

public class DefaultListableBeanFactory implements BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();
    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getBean(String name) {

        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        if (beanDefinition == null) {
            throw new RuntimeException("No bean named '" + name + "' is defined");
        }

        try {

            if ("singleton".equals(beanDefinition.getScope())) {
                Object singleton = singletonObjects.get(name);
                if (singleton == null) {
                    singleton = createBean(beanDefinition);
                    singletonObjects.put(name, singleton);
                }
                return singleton;
            } else {
                return createBean(beanDefinition);
            }

        } catch (Exception e) {
            throw new RuntimeException("Failed to create bean '" + name + "'", e);
        }

    }

    private Object createBean(BeanDefinition beanDefinition) throws Exception {
        return beanDefinition.getBeanClass().getDeclaredConstructor().newInstance();
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        this.beanDefinitionMap.put(name, beanDefinition);
    }
    
}
