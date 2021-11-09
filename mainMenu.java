import java.util.InputMismatchException;
import java.util.Scanner;

public class mainMenu {
	
	public int choice;
	Scanner kb = new Scanner(System.in);
	public mainMenu() {};
	
	public void displayMain(filterMenu filter)
	{
		
		while(true)
		{
			System.out.println("***Welcome! What would you like to do?***"
					+ "\n1. Browse \n2. Sell " + 
					" \n3. Title Check \n0. Logout");
			System.out.print("Enter number: ");
			
			try
			{
				choice = kb.nextInt();
				if(choice == 1)
				{
					filter.displayFilter();
				}
				
				else if(choice == 2)
				{
					System.out.println("Manage listings");
				}
				
				else if(choice == 3)
				{
					System.out.println("Input VIN");
				}
				
				else if(choice == 0)
				{
					System.out.print("Logged out");
					break;
				}
				
				else
				{
					System.out.println("***Invalid input***");
				}
					
			}
			
			catch(InputMismatchException ex)
			{
				System.out.print("***Invalid input***\n");
				kb.next();
			}
	
		}
		
	}

}
