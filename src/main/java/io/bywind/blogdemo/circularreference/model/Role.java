package io.bywind.blogdemo.circularreference.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * Created on Jun 26, 2019.
 *
 * @author hatakawas
 */
@Data
public class Role implements Serializable {
    private static final long serialVersionUID = -1010779376840049910L;
    private Long id;
    private String name;
    private List<User> users = new ArrayList<>();
}
