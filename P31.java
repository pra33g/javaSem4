//31. 	WAP that makes use of StringBuffer class methods	
class P31{
	public static void main(String args[]){
		StringBuffer s = new StringBuffer("ABCD");
		System.out.println(s.append("abc"));
		System.out.println("s.capacity(): " + s.capacity());
		System.out.println("s.isEmpty(): " + s.isEmpty());
		System.out.println("s.length(): " + s.length());
		System.out.println(s.lastIndexOf("BC"));
		System.out.println("s.reverse(): " + s.reverse());s.reverse();
		System.out.println("s.replace(2,3,\"XXX\"): " + s.replace(2, 3, "XXX"));
		System.out.println("s.insert(3, \"---\"): " + s.insert(3, "---"));		
		System.out.println("s.delete(2, 8)"+ s.delete(2, 8));
	}
}