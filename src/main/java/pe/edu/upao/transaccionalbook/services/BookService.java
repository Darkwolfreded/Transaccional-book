package pe.edu.upao.transaccionalbook.services;

import pe.edu.upao.transaccionalbook.models.Book;
import pe.edu.upao.transaccionalbook.repositories.BookRepository;

public class BookService {

    public BookRepository bookRepository;
    public void addBook(Book book) {
        bookRepository.save(book);

    }
}
