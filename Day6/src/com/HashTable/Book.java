package com.HashTable;

public class Book 
{
	Integer Bookid;
	String Bookname;
	String Bookauthor;
	Double BookPrice;
	public Integer getBookid() {
		return Bookid;
	}
	public void setBookid(Integer bookid) {
		Bookid = bookid;
	}
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	public String getBookauthor() {
		return Bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		Bookauthor = bookauthor;
	}
	public Double getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		BookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [Bookid=" + Bookid + ", Bookname=" + Bookname + ", Bookauthor=" + Bookauthor + ", BookPrice="
				+ BookPrice + "]";
	}
	public Book(Integer bookid, String bookname, String bookauthor, Double bookPrice) {
		super();
		Bookid = bookid;
		Bookname = bookname;
		Bookauthor = bookauthor;
		BookPrice = bookPrice;
	}
	
	

}
