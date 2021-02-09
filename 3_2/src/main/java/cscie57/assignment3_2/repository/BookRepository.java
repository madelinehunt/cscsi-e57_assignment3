package cscie57.assignment3_2.repository;

import cscie57.assignment3_2.domain.Book;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
    
}
