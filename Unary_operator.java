package april;

public class Unary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Unary operator has only one operand
		// ++, --, +, -, !,~
		// + as Unary operator
		// + as Arithmatic operator
		// + as apend operator
		
		int i= 10;
		//System.out.println(i);
		//System.out.println(10+20+30);// Here. + is acting as arithmetic operator
		//System.out.println(10+20+""+30); //Here, for "10+20" it acted as arithmetic and after string "" its acting as string
		//System.out.println(""+10+20+30);// Here, as it starts with "", so it acting completely as string.
		// Until the string does not come into the play + operator will behave as arithmetic operator
		
		//Increment/Decrement
		// Increment: Pre-Increment(first increment then assign)/ Post increment(first assign then increment) 
		
		
		int k= 10;
		//int j= k++;
		//int j= ++k + k++ + k++ + ++k;
		//11 + 11 + 12 + 14 =48
		int j= k++ + ++k + k++ + k++ + ++k + k-- + --k;
		     // 10 + 12 + 12 + 13 + 15 + 15 +13 = 90     
		System.out.println("j=" +j);
		System.out.println("k=" +k);
		//int m= ++k;
		//System.out.println("j="+j);
		//System.out.println("k="+k);
		//System.out.println("m=" +m);
		
		//******************************************************************//
		
		//! operator is used for reversing
		boolean b1= false; // reverse of false will be declared
		System.out.println(!b1);
		
		
		
		

	}

}
