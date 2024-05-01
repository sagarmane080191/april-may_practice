package May_practice;

public class Assignment_lecture {

	public static void main(String[] args) 
	{
		//Sum of digit
		//reverse number
		//Fibonaci series
		//Factors
		//Palindrom
		//Prime number
		
// Sum of digit
//		int n= 868954;
	//	int sum= 0;
		//while(n!=0)
	//	{
		//int lastdigit= n%10;
		//n=n/10;
		//sum= sum+lastdigit;
	//	}
	//System.out.println("Sum of digit=" +sum);			
	//}
	//}
//********************************************************************//

//Reverse of Number

int n=4565464;
int rev=0;
while(n!=0)
{
	int lastdigit= n%10;
rev=rev*10+lastdigit;
n=n/10;
	}
System.out.println("rev=" +rev);
	}


}