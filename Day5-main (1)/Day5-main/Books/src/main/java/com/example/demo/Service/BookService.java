package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Book;

import com.example.demo.Repository.MyRepo3;

@Service
public class BookService {

	@Autowired
	private MyRepo3 reps;

// addStudent                                                                                                                                          
	public Book addBook(Book obj) {
		Book b = reps.save(obj);
		return b;
	}

//getStudent                                                                                                                                           
	public List<Book> getBook() {
		List<Book> arr = new ArrayList<>();
		arr = reps.findAll();
		return arr;
	}
//	public List<Icecream> findProductWithSorting(String field)                                                                                         
//	{                                                                                                                                                  
//		return rep.findAll(Sort.by(Sort.Direction.ASC,field)) ;                                                                                        
//	}                                                                                                                                                  

//deleteById                                                                                                                                           
	public void deleteBook(int id) {
		reps.deleteById(id);

	}

	public Book updateBook(Book obj, int id) {
		Book sam = reps.findById(id).get();

		if (Objects.nonNull(sam) && (!Objects.isNull(obj.getAuthor()))) {
			sam.setAuthor(obj.getAuthor());

		}
		if (Objects.nonNull(sam) && (obj.getQuantity() != 0)) {
			sam.setQuantity(obj.getQuantity());
		}

		if (Objects.nonNull(sam) && (!Objects.isNull(obj.getName()))) {
			sam.setName(obj.getName());
		}
		if (Objects.nonNull(sam) && (obj.getPrice() != 0)) {
			sam.setPrice(obj.getPrice());

		}

		return reps.saveAndFlush(sam);
	}

	public List<Book> showvalues() {
		Pageable p = PageRequest.of(0, 2, Sort.by(Sort.Direction.ASC, "name"));
		Page<Book> c = reps.findAll(p);
		return c.toList();
	}

	public List<Book> GetAllBook() {
		List<Book> c = reps.findAll();
		return c;

	}

}
