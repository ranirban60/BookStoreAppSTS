package com.bridgelabz.bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="Book")
public class BookModel {

	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "bookId", nullable = false)
	    private Long bookId;

	    @Column(name="book_name")
	    private String bookName;
	    private String authorName;
	    private int bookQuantity;
	    private int price;
	    private String bookImage;
	    private String bookDescription;
	    
		public Long getBookId() {
			return bookId;
		}
		public void setBookId(Long bookId) {
			this.bookId = bookId;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public int getBookQuantity() {
			return bookQuantity;
		}
		public void setBookQuantity(int bookQuantity) {
			this.bookQuantity = bookQuantity;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getBookImage() {
			return bookImage;
		}
		public void setBookImage(String bookImage) {
			this.bookImage = bookImage;
		}
		public String getBookDescription() {
			return bookDescription;
		}
		public void setBookDescription(String bookDescription) {
			this.bookDescription = bookDescription;
		}
	    
		

		
	    
	
}
