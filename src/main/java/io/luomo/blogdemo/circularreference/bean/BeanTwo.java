package io.luomo.blogdemo.circularreference.bean;

import org.springframework.stereotype.Component;

/**
 * Created on Jun 26, 2019.
 *
 * @author hatakawas
 */
@Component
public class BeanTwo {
    private final BeanOne beanOne;

    public BeanTwo(BeanOne beanOne) {
        this.beanOne = beanOne;
    }

    public void sayHi() {
        String message = String.format("Hi, this is %s.", this);
        System.out.println(message);
    }

    public void talk() {
        beanOne.sayHi();
        String reply = String.format("Hello, %s, glad to see you.", beanOne);
        System.out.println(reply);
    }

    @Override
    public String toString() {
        return "beanTwo";
    }
}
