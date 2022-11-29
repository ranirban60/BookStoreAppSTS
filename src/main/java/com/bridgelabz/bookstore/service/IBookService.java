package com.bridgelabz.bookstore.service;

import java.util.List;

import com.bridgelabz.bookstore.dto.BookDto;

public interface IBookService {

	BookDto addBook(BookDto bookDto);

	List<BookDto> getAllBook();

	BookDto findById(Long bookId);

	void deleteById(Long bookId);

	BookDto findByBookName(String bookName);

	BookDto updateData(Long bookId, BookDto bookDto);


}
