import java.util.Scanner;

public class A {
	
	
	public static void main(String[] args) {
		
		System.out.println("Let's Create Simple Calc Program:");
		
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("Please Enter The  First Number");//is use to take the standard input
		  int Firstnum = scan.nextInt();// nextInt method is used to read  the data from the console
		  System.out.println("Please Enter The  Second Number");
		  int Secondnum = scan.nextInt();
		 
		  int res = Firstnum/Secondnum;
		  System.out.println("The Result is:" +res);
		}catch(Exception e){
			System.out.println("your connection is failed due to illogical number press");
			  
		  }
		System.out.println("Connection is gracefully terminated");
	}

}
