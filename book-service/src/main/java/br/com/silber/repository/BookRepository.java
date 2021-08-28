package br.com.silber.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.silber.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
