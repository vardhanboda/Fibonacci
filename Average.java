import java.util.*;
public class Average {
public static void main(String args[]){
	System.out.println("Enter 3 numbers");
	Scanner input=new Scanner(System.in);
	int a,b,c;
	float avg;
	a=input.nextInt();
	b=input.nextInt();
	c=input.nextInt();
	
	avg=(a+b+c)/3;
	System.out.println("average is:"+avg);
	
	
}
}
