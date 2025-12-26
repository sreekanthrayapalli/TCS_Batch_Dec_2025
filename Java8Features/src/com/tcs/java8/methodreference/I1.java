package com.tcs.java8.methodreference;

@FunctionalInterface
public interface I1 {
	void method1();
}

/*     i2  -->void method2(int a,int b)
 * 
 * I2 obj = (a,b)->{
 * 
 * 
 * }
 * 
 */

/*
class C1 implements I1{
main(){
I1 obj = ()->{

};


}
}

*/