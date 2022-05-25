//25	Demonstrate the concept of static variable, static function and static block.	
class P25{
	static int var;
	static {
		var = 20;	
		System.out.println("Static var P25::var set to 20 in static block.");
	}
	static void method(){
		System.out.println("P25::var = " + var + " inside static method.");
	}
	public static void main(String args[]){
		P25.method();
	}
}