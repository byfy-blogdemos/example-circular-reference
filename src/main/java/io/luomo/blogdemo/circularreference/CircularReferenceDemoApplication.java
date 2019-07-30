package io.luomo.blogdemo.circularreference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import io.luomo.blogdemo.circularreference.bean.BeanOne;
import io.luomo.blogdemo.circularreference.bean.BeanTwo;

/**
 * Created on Jun 25, 2019.
 *
 * @author hatakawas
 */
@SpringBootApplication
public class CircularReferenceDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CircularReferenceDemoApplication.class);
        BeanOne beanOne = context.getBean(BeanOne.class);
        BeanTwo beanTwo = context.getBean(BeanTwo.class);
    }
}
