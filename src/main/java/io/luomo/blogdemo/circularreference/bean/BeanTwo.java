package io.luomo.blogdemo.circularreference.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created on Jun 26, 2019.
 *
 * @author hatakawas
 */
@Component
public class BeanTwo {
    private final BeanOne beanOne;

    @Lazy
    public BeanTwo(BeanOne beanOne) {
        this.beanOne = beanOne;
    }
}
