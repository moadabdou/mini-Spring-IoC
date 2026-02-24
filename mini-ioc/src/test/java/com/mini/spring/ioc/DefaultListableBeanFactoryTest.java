package com.mini.spring.ioc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DefaultListableBeanFactoryTest {

    @Test
    public void testBeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        assertNotNull(helloService);
        assertEquals("hello", helloService.sayHello());
    }

    @Test
    public void testSingleton() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanDefinition.setScope("singleton");
        
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        HelloService helloService1 = (HelloService) beanFactory.getBean("helloService");
        HelloService helloService2 = (HelloService) beanFactory.getBean("helloService");
        
        assertNotNull(helloService1);
        assertSame(helloService1, helloService2);
    }

    @Test
    public void testPrototype() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanDefinition.setScope("prototype");
        
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        HelloService helloService1 = (HelloService) beanFactory.getBean("helloService");
        HelloService helloService2 = (HelloService) beanFactory.getBean("helloService");
        
        assertNotNull(helloService1);
        assertNotSame(helloService1, helloService2);
    }

    static class HelloService {
        public String sayHello() {
            return "hello";
        }
    }
}
