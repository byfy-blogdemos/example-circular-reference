package io.luomo.blogdemo.circularreference.bean;

import javax.annotation.PostConstruct;

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

    @PostConstruct
    public void init() {
        beanTwo.setBeanOne(this);
    }
}
