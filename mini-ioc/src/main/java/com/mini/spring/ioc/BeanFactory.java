package com.mini.spring.ioc;

public interface BeanFactory {
 
    Object getBean(String name);
    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
    
}
