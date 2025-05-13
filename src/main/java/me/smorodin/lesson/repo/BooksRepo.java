package me.smorodin.lesson.repo;
import me.smorodin.lesson.entity.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepo extends CrudRepository<Books, Long>{

}
