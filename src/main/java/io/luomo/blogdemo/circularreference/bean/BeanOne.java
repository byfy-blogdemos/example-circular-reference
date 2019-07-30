package io.luomo.blogdemo.circularreference.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created on Jun 26, 2019.
 *
 * @author hatakawas
 */
@Component
public class BeanOne {
    private BeanTwo beanTwo;

    @Autowired
    public void setBeanTwo(BeanTwo beanTwo) {
        this.beanTwo = beanTwo;
    }
}
