package io.bywind.blogdemo.lazyinit.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import io.bywind.blogdemo.lazyinit.model.Book;

/**
 * Created on Jun 25, 2019.
 *
 * @author hatakawas
 */
@Service
public class BookServiceImpl implements BookService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BookServiceImpl.class);

    private Map<Long, Book> bookshell = new HashMap<>();

    @Override
    public void stock() {
        Book book1 = new Book(1L, "HTTP: The Definitive Guide", "978-7-115-28148-7", "David Gourley, Brian Totty");
        Book book2 = new Book(2L, "Hadoop构建数据仓库实践", "978-7-302-46980-3", "王雪迎");
        bookshell.put(book1.getId(), book1);
        bookshell.put(book2.getId(), book2);
        LOGGER.info("Stocked {} books on bookshell.", bookshell.size());
    }

    @Override
    public Book getBook(Long id) {
        return bookshell.get(id);
    }
}
