package me.smorodin.lesson.repo;

import me.smorodin.lesson.entity.Reader;
import org.springframework.data.repository.CrudRepository;

public interface ReaderRepo extends CrudRepository<Reader, Long> {
}
