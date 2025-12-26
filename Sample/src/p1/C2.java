package p1;

public class C2  extends C1{

	int a=10,b=20;
	void m1() {
		int a=100;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	
	void m2() {
		System.out.println("M2 method in C2");
	}
	
	void m3() {
		m2();
		super.m2();
	}
}
