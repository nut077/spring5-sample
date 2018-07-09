package com.spring5.nut.repository;

import com.spring5.nut.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
