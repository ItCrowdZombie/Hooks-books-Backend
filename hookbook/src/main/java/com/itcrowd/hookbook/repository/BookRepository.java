package com.itcrowd.hookbook.repository;

import com.itcrowd.hookbook.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository <Book, Integer>{

}
