package cscie57.assignment3_2.services;

import cscie57.assignment3_2.domain.Book;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {

    List<Book> findAll();

    Book findById(Long id);

    Book save(Book book);

    Page<Book> findAllByPage(Pageable pageable);

}
