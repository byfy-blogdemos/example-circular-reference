package io.bywind.blogdemo.lazyinit.service;

import io.bywind.blogdemo.lazyinit.model.Book;

/**
 * Created on Jun 25, 2019.
 *
 * @author hatakawas
 */
public interface BookService {
    void stock();

    Book getBook(Long id);
}
