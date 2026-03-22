package class_object;

public class TeamApp {
	
	public static void main(String[] args) {
		
		Player p = new Player();
		Team t = new Team();
		
		Player ply = new Player();
		ply.setId(45);
		ply.setName("Rohit sharma");
		ply.setRun(101);
		
		t.addPlayer(ply);
		t.showPlayer();
	System.out.println("==========================================");	
		Player ply1 = new Player();
		ply1.setId(100);
		ply1.setName("Virat kohli");
		ply1.setRun(10);
		t.addPlayer(ply1);
		t.showPlayer();
		
	}

}
