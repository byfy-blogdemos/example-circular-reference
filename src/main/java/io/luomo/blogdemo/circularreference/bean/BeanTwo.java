package io.luomo.blogdemo.circularreference.bean;

import org.springframework.stereotype.Component;

/**
 * Created on Jun 26, 2019.
 *
 * @author hatakawas
 */
@Component
public class BeanTwo {
    private BeanOne beanOne;

    public void setBeanOne(BeanOne beanOne) {
        this.beanOne = beanOne;
    }
}
