package class_object;

import java.util.Scanner;

public class PlayerRunApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Player1 p1[] = new Player1[5];//Array of reference
		for(int i=0;i<p1.length;i++)
		{
			System.out.println("Enter name,id&run of player");
			String name = sc.nextLine();
			int id = sc.nextInt();
			int run = sc.nextInt();
			
			p1[i] = new Player1();//Array of objects
			p1[i].setId(101);
			p1[i].setName("vishal");
			p1[i].setRun(100);
			sc.nextLine();
			
		}
		System.out.println("Display player details");
		for(int i=0;i<p1.length;i++)
		{
			System.out.println(p1[i].getId() + " " + p1[i].getName() +" " +p1[i].getRun());
		}
		
		
		
		
	}

}
