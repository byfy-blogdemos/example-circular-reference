package io.bywind.blogdemo.circularreference.bean;

import org.springframework.stereotype.Component;

/**
 * Created on Jun 26, 2019.
 *
 * @author hatakawas
 */
@Component
public class BeanOne {
    private final BeanTwo beanTwo;

    public BeanOne(BeanTwo beanTwo) {
        this.beanTwo = beanTwo;
    }

    public void sayHi() {
        System.out.println("Hi, this is beanOne.");
    }

    public void talk() {
        beanTwo.sayHi();
        String reply = String.format("Hello, %s, glad to see you.", beanTwo);
        System.out.println(reply);
    }

    @Override
    public String toString() {
        return "beanOne";
    }
}
