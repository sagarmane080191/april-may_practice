package May_practice;

public class Sum_of_digits {

	public static void main(String[] args) {
		
		//Algorithm: 
		//53= 5+3
		// TODO Auto-generated method stub
		//int i=53;
		//int Reminder= i%10;
		//int div= i/10;
		//int sum= Reminder+ div;
		//System.out.println(sum);
		
		//How to check odd/even: Use operator % Reminder, no. reminder by 2 is 0 its even else odd.
		//How to reverse a number i.e 85 to 58
		
		int i=85;
		int Reminder= i%10;
		int div= i/10;
		int Reverse= Reminder*10+ div;  //This logic will work for only 2 digits number
		System.out.println("Reverse=" +Reverse);
		
		
	}

}
