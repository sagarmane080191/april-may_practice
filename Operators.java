package april;

public class Operators {

	public static void main(String[] args) {
		//Arithmatic and comparison operator(/, *, +,-), boolean(true/false),logical operator, bitwise operator (& and OR)
		// TODO Auto-generated method stub
		//10+5=15 10 & 5 are operands and + is operator
		int i=10;
		int j=7;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i%j); //Reminder
		
		//BODMAS is applicable here too as per its rule
		
		//Comparison operator, Comparison operator will always give you answere as True or False.
		System.out.println(i>j);
		System.out.println(i<j);
		System.out.println(i>=j);
		System.out.println(i<=j);
		System.out.println(i==j);
		System.out.println(i!=j);
		// Bitwise operator i.e AND/OR operator
		//AND (both condition should be true, so then only it will return true)
		// true & true= true
		//true & false= false
		//false & false= false
		//false & true= false
		
		//OR operator (If any one condition is true, it will return true)
		// true & true= true
		//true & false= true
		//false & false= false
		//false & true= true
		
		int k=10;
		int l= 20;
		System.out.println((k>=l) |(l<=k));
		System.out.println((k>=l) ||(l<=k));
		System.out.println((k>=l) && (l>=k));
		
		//Logical operator (&& i.e AND : if the 1st situation is ture, it wont check the 2nd situation)
		// Logical operator && and ||
		
		
		
	}

}
