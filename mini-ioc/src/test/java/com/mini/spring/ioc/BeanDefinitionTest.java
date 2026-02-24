package com.mini.spring.ioc;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class BeanDefinitionTest {

    @Test
    void shouldCreateBeanDefinitionWithClass() {
        BeanDefinition beanDefinition = new BeanDefinition(String.class);

        assertThat(beanDefinition.getBeanClass()).isEqualTo(String.class);
    }

    @Test
    void shouldHaveDefaultSingletonScope() {
        BeanDefinition beanDefinition = new BeanDefinition(String.class);

        assertThat(beanDefinition.getScope()).isEqualTo("singleton");
    }

    @Test
    void shouldHaveDefaultLazyInitFalse() {
        BeanDefinition beanDefinition = new BeanDefinition(String.class);

        assertThat(beanDefinition.isLazyInit()).isFalse();
    }

    @Test
    void shouldSetScope() {
        BeanDefinition beanDefinition = new BeanDefinition(String.class);
        beanDefinition.setScope("prototype");

        assertThat(beanDefinition.getScope()).isEqualTo("prototype");
    }

    @Test
    void shouldSetLazyInit() {
        BeanDefinition beanDefinition = new BeanDefinition(String.class);
        beanDefinition.setLazyInit(true);

        assertThat(beanDefinition.isLazyInit()).isTrue();
    }

    @Test
    void shouldInitializeCollections() {
        BeanDefinition beanDefinition = new BeanDefinition(String.class);

        assertThat(beanDefinition.getConstructorArgumentBeanNames()).isNotNull().isEmpty();
    }
}
