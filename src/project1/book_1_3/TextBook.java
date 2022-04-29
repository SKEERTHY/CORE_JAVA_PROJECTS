package project1.book_1_3;

import java.util.Scanner;

public class TextBook {
	public void createBooks() {
		Book bk[] = new Book[2];		 
	      bk[0] = new Book("Java Programing ", 350.50);
	      bk[1] = new Book("Let Us C", 200.00);
	      for(int i = 0; i<bk.length; i++) {
		         bk[i].display();
		         System.out.println(" ");
	      }
	    
	      }
	
	public void showBooks() {
		  	createBooks();
		
	}
	public static void main(String args[])  {
	    TextBook c1 = new TextBook();  
		c1.showBooks();
	   
	      }

}