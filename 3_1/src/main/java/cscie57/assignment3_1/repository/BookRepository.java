package cscie57.assignment3_1.repository;

import cscie57.assignment3_1.domain.Book;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
    
}