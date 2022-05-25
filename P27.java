import java.util.Scanner;

//27	WAP to input salary of a person along with his name, if the salary is less than 85,000 then throw an arithmetic exception with a proper message “not eligible for loan�?.	
class P27{
	public static void main(String args[]){
		System.out.println("Input name and salary:");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		float salary = s.nextFloat();
		try{
			if (salary < 85000){
				s.close();
				throw new ArithmeticException(name + "Not eligible for loan!");
			}

		} catch (Exception e){
			System.out.println(e);
		}
		s.close();
	}
}