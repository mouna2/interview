package Bank;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
public class Processor {
	public static void main (String [] args) {
		Stack<String> stack= new Stack<String>(); 
	   Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	   Account acc= new Account(); 
	   String option="0"; 
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   while(!option.equals("4")) {
		   System.out.println("Enter number correponding to the option you would like to choose 1-deposit 2-withdraw 3-print statement 4-exit");

		   option=scanner.nextLine(); 

		   if(option.equals("1")) {
			   System.out.println("enter amount you would like to deposit");
			   String amount=scanner.nextLine(); 
			   acc.deposit(Integer.parseInt(amount));
			   System.out.println(Account.sum);
			   LocalDateTime now = LocalDateTime.now();  

			   stack.push("DEPOSIT "+Integer.parseInt(amount)+ " DATE/TIME "+	   dtf.format(now));  

			   
		   }else if(option.equals("2")) {
			   System.out.println("enter amount you would like to withdraw");
			   String amount=scanner.nextLine(); 
			   acc.withdraw(Integer.parseInt(amount));
			   System.out.println(Account.sum);
			   LocalDateTime now = LocalDateTime.now();  

			   stack.push("WITHDRAW "+Integer.parseInt(amount)+ " DATE/TIME "+	   dtf.format(now));  

		   }else if(option.equals("3")) {
			    // 1. Using an iterator to iterate through a stack
		        Iterator<String> itr = stack.iterator();
		 
		        // hasNext() returns true if the stack has more elements
		        while (itr.hasNext())
		        {
		            // next() returns the next element in the iteration
		            System.out.println(itr.next());
		        }
		 
		   }
	   }
	   
   }
}
