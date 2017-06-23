import java.util.*;
public class Reverse {
	
	private int number;
	
	public Reverse(int number)
	{
		this.number=number;
	}
	
public static void main(String[] args) {
	int n;
	System.out.println("enter the number");
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
Reverse call=new Reverse(n);
System.out.println(call.isPolindrome());

}

public int reverse()
{	
	int num=number;
	int rem;
	int rev=0;
	
	while(num>0)
	{
	rem=num%10;
		num=num/10;
		
		rev=rev*10+rem;
	
		System.out.print(""+rem);
	
}
	return rev;
}

public  boolean isPolindrome()
{
	int rev=reverse();

	if(number==rev)
	 {
		return true;
	 }
	 else
	 {
		 return false;
	 }
		 
}


}