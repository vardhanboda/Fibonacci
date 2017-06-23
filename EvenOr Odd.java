import java.util.*;
public class Even {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter number");
	int y=Integer.parseInt(input.nextLine());
	for(int x=1;x<=y;x++)
	{
		if(x%2==0)
			System.out.println( x+ " Is even number");
		else
		{
			System.out.println(x+ " Is odd Number");
		}
			
	}
		}
	

	
	

}
