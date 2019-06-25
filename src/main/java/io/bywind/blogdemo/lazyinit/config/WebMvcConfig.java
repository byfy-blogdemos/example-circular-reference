package io.bywind.blogdemo.lazyinit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.bywind.blogdemo.lazyinit.controller.interceptor.StockInterceptor;
import io.bywind.blogdemo.lazyinit.service.BookService;

/**
 * Created on Jun 25, 2019.
 *
 * @author hatakawas
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private final BookService bookService;

    @Autowired
    public WebMvcConfig(BookService bookService) {
        this.bookService = bookService;
    }


    @Bean
    public StockInterceptor stockInterceptor() {
        return new StockInterceptor(bookService);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(stockInterceptor());
    }
}
