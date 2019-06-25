package io.bywind.blogdemo.lazyinit.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import io.bywind.blogdemo.lazyinit.service.BookService;

/**
 * Created on Jun 25, 2019.
 *
 * @author hatakawas
 */
public class StockInterceptor implements HandlerInterceptor {
    private static final Logger LOGGER = LoggerFactory.getLogger(StockInterceptor.class);

    private final BookService bookService;

    public StockInterceptor(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        LOGGER.debug("Intecepted request: {} {}", request.getMethod(), request.getRequestURI());
        bookService.stock();
        return true;
    }
}
