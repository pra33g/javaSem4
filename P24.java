//24	Write a program to demonstrate the concept of abstract class with constructor and ``final`` method.	
abstract class A{
	int var;
	A(){
		var = 10;
	}
	final void method() {
		System.out.println("A::var = " + var);
	}
}
class B extends A{
	B(){}
	// void method(){
	// ERROR
	// }
}
class P24{
	public static void main(String args[]){
		B b = new B();
		b.method();
	}
}