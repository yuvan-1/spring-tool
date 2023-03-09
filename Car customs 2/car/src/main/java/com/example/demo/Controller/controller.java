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

import com.example.demo.Entity.car;
import com.example.demo.service.carService;


@RestController
public class controller {


	@Autowired
	public carService ser;
	@GetMapping("/show")
	public List<car> getDetails(){
		return ser.getAllDetails();		
		}
		
		@PostMapping("/add")
		public car  post(@RequestBody car q) {
			return ((carService) ser).addaddress(q);
		}
		@DeleteMapping("/delete/{id}")
		public void  delete(@PathVariable int id) {
		   ((carService) ser).deleteaddress(id);
		}
	    @PutMapping("/update/{id}")
	    public car put(@PathVariable int id,@RequestBody car q) {
	    	return ((carService) ser).updateaddress(id,q);
	    }
	    
}
