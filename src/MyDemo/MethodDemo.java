package MyDemo;

public class MethodDemo {
	
	int id;
	String name;
	char div;
	String ColName;
	
	public void display()
	{
		System.out.println(id + " "+name + " "+div + " "+ColName);
	}

	public void show(int sid,String sname,char sdiv,String sColName)
	{
		id = sid;
		name = sname;
		div = sdiv;
		ColName =sColName;
	}
		
		
}


