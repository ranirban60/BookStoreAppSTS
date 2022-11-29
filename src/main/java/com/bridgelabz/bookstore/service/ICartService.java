package com.bridgelabz.bookstore.service;

import java.util.List;

import com.bridgelabz.bookstore.ResponseEntity;
import com.bridgelabz.bookstore.dto.CartDto;

public interface ICartService {

	ResponseEntity addBook(CartDto cartDto);

	List<CartDto> findAll();

	CartDto findById(Long id);

	void deleteById(Long id);

	CartDto updateCartData(Long id, CartDto cartDto);

}
