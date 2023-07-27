package com.rimmelasghar.boilerplate.springboot.service;
import com.rimmelasghar.boilerplate.springboot.model.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> getAllBooks();

    Optional<Book> getBookById(Long id);

    Book saveBook(Book book);

    void deleteBook(Long id);
}
