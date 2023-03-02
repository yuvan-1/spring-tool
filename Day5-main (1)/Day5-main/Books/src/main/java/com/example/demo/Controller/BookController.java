package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Book;
import com.example.demo.Service.BookService;




@RestController
public class BookController {
	
	@Autowired
	private BookService studs;
	

	@GetMapping("/show")
	public List<Book> showBook() {
		return studs.getBook();
	}

	@PostMapping("/add")
	public Book addBook(@RequestBody Book obj) {
		return studs.addBook(obj);
	}

	@DeleteMapping("/delete/{id}")
	public String delBook(@PathVariable int id) {
		studs.deleteBook(id);
		return "Successfully deleted";
	}
    @PutMapping("/update/{id}")
    public Book updateBook(@RequestBody Book obj,@PathVariable int id)
    {
    	return studs.updateBook(obj, id);
    } 
//	@GetMapping("/show/{id}")
//	public Optional<Student> findById(@PathVariable Long id) {
//		return stud.findById(id);
//	}

}