package io.bywind.blogdemo.lazyinit.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created on Jun 25, 2019.
 *
 * @author hatakawas
 */
@Data
@AllArgsConstructor
public class Book implements Serializable {
    private static final long serialVersionUID = -1054811052077230319L;
    private Long id;
    private String name;
    private String isbn;
    private String author;
}
