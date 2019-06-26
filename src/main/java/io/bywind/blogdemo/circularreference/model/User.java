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
public class User implements Serializable {
    private static final long serialVersionUID = 8436298980076108694L;
    private Long id;
    private String username;
    private List<Role> roles = new ArrayList<>();
}
