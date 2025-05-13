package me.smorodin.lesson.repo;

import me.smorodin.lesson.entity.Author;
import org.springframework.data.repository.CrudRepository;
public interface AuthorRepo extends CrudRepository<Author, Long> {
}
