package com.spring5.nut.repository;

import com.spring5.nut.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
