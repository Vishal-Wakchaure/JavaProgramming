package class_object;

public class Team {
	
	 Player p1;
	
		void addPlayer(Player p)
	{
		p1=p;
	}
		void showPlayer()
		{
//			System.out.println("Id of player is" +p1.getId());
//			System.out.println("Name of player is" +p1.getName());
//			System.out.println("Run of player is" +p1.getRun());
			System.out.println("Id: " + p1.getId() + ", Name: " + p1.getName() + ", Run: " + p1.getRun());
		}

}
