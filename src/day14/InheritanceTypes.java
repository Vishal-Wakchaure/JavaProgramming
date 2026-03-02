package day14;


 class A 
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}
 class B extends A
 {
	 int b;
	 void show()
	 {
		 System.out.println(b);
	 }
 }
	 class C extends B
	 
	 {
		 int c1;
		 void print()
		 {
			 System.out.println(this.c1=c1);
			 System.out.println(this.b=b);
			 System.out.println(this.a=a);
		 }
	 }
 
 


public class InheritanceTypes {
	public static void main(String[] args) {
		
	
// B bobj = new B();
// System.out.println(bobj.a);
// System.out.println(bobj.b);
// bobj.display();
// bobj.show();
		
		C cobj = new C();
		cobj.a = 100;
		cobj.b = 200;
		cobj.c1 =300;
		
//		cobj.show();
//		cobj.display();
		cobj.print();

}
}
 
