package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Book;

public interface MyRepo3 extends JpaRepository<Book,Integer> {

}
