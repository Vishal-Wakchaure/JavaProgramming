package class_object;

import java.util.Scanner;

public class BookLibApp {
	
	public static void main(String[] args) {
		Book book[] = new Book[5];
		for(int i=0;i<book.length;i++)
		{
			book[i] = new Book(); //Array of object
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name id & price of book");
			String name = sc.nextLine();
			int id = sc.nextInt();
			int price = sc.nextInt();
			
			book[i].setName("vishal");
			book[i].setId(101);
			book[i].setPrice(1000);
		
		}
		Library lib = new Library();
		lib.setBooks(book);
		Book result[] = lib.getBooks();
		System.out.println("display book details");
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i].getId() + " " + result[i].getName("vishal") + " " + result[i].getPrice(103) + " ");
		}
	}

}
