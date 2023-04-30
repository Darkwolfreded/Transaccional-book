package pe.edu.upao.transaccionalbook.controllers;

import pe.edu.upao.transaccionalbook.models.Book;
import pe.edu.upao.transaccionalbook.services.BookService;

public class BookController {

    public BookService bookService;
    public void addBook(){
        Book book = new Book();
        bookService.addBook(book);

    }
}
