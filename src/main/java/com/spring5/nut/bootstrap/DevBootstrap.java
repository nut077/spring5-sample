package com.spring5.nut.bootstrap;

import com.spring5.nut.model.Author;
import com.spring5.nut.model.Book;
import com.spring5.nut.model.Publisher;
import com.spring5.nut.repository.AuthorRepository;
import com.spring5.nut.repository.BookRepository;
import com.spring5.nut.repository.PublisherRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Publisher publisher = new Publisher();
        publisher.setName("foo");
        publisherRepository.save(publisher);

        Author author1 = new Author("Nut", "Freedom");
        Book book1 = new Book("Java", "1234", publisher);
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);

        authorRepository.save(author1);
        bookRepository.save(book1);

        Author author2 = new Author("Rican", "Freedom");
        Book book2 = new Book("Html", "1234", publisher);
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);

        authorRepository.save(author2);
        bookRepository.save(book2);
    }
}
