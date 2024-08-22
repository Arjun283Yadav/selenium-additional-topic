package zx;

public class A {

	static String st = "hi";
	String str = "by";
	
	private A() {
		System.out.println("I am Constructor....");
	}
	
	private static A A;
	
	public static A getObjet(){
		if (A==null) {
			new A();
		}
		return A; 
	}
	
	
	{
		method1();
	}
	
	public void method1() {
		System.out.println(i);
		
	}
	
	public static void m2() {
		System.out.println(" I am Static void..");
	}
	
	static int i = 15;
	
	public static void main(String[] args) {
		
		System.out.println("I am main Method...");
		A a =new A();
//		System.out.println(a.i);
	}
	
	
}
