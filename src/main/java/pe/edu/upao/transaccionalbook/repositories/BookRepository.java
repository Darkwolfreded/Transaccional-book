package pe.edu.upao.transaccionalbook.repositories;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upao.transaccionalbook.models.Book;

public class BookRepository {

    @Autowired Session session;

    public void save(Book book) {
        session.save(book);
    }

    public void list(){
        session.createQuery("select b from Book b");
    }
}
