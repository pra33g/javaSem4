//30	 WAP that makes use of String class methods	
class P30{
	public static void main(String args[]){
		System.out.println("String::format() used:");
		float x = 20.20f;
		String formatted = String.format("%.2f is a float value!", x);
		System.out.println(formatted);

		System.out.println("\nString::valueof(int) used:");
		String intString = String.valueOf(29);
		System.out.println(intString + " <- a string!");

		System.out.println("\nString::join() used:");
		String joinUsed = String.join("-", "Using", "the", "String::join()", "method!");
		System.out.println(joinUsed);

		String s = "ABCD";
		System.out.println("\ns = " + s);
		System.out.println("hashcode of s = " +  s.hashCode());
		System.out.println("s.charAt(0): " + s.charAt(0));
		System.out.println("s.codePointAt(0): " + s.codePointAt(0));
		System.out.println("s.indent(20): " + s.indent(20));
		System.out.println("s.indexOf(\"BCD\"): " + s.indexOf("BCD"));
		System.out.println("s.substring(2,4): " +s.substring(2, 4));
		System.out.println("s.endsWith(\"BCD\"): " + s.endsWith("BCD"));
	}
}