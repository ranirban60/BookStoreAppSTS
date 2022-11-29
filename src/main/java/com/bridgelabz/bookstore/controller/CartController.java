package com.bridgelabz.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.bookstore.ResponseEntity;
import com.bridgelabz.bookstore.dto.BookDto;
import com.bridgelabz.bookstore.dto.CartDto;
import com.bridgelabz.bookstore.service.ICartService;

@RestController
@RequestMapping("/Cart")
public class CartController {
 
	@Autowired
	ICartService cartService;
	
	@PostMapping("/add")
	public ResponseEntity addBook(@RequestBody CartDto cartDto) {
		ResponseEntity add = cartService.addBook(cartDto);
		return new ResponseEntity(add, "Cart details added succesfully");
	}
	
	@GetMapping("/getAll")
	public ResponseEntity findAll() {
		List<CartDto> cartList = cartService.findAll();
		return new ResponseEntity(cartList, "All cart list");
	}
	
	@GetMapping("/get/{Id}")
	 public ResponseEntity findById(@PathVariable Long Id) {
    	CartDto cart = cartService.findById(Id);
    	return new ResponseEntity(cart,"All details cart list using Id"); 
    }
	
	@DeleteMapping("/delete/{ID}")
	 public ResponseEntity deleteById(@PathVariable Long Id) {
    	cartService.deleteById(Id);
    	return new ResponseEntity(cartService,"Cart data is deleted succesfully");
    }
	
	@PutMapping("/update")
    public ResponseEntity editData(@RequestParam Long Id, @RequestBody CartDto cartDto) {
		CartDto cart = cartService.updateCartData(Id, cartDto);
    	return new ResponseEntity(cart,"Data is updated successfully");
    }
}
