package io.luomo.blogdemo.circularreference.bean;

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
}
