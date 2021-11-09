import java.util.InputMismatchException;
import java.util.Scanner;

public class filterMenu {
	
	public int choice;
	Scanner kb = new Scanner(System.in);
	
	public filterMenu() {};
	
	public void displayFilter()
	{
		while(true)
		{
			System.out.println("Browsing the available vehicles. "
					+ "How would you like to proceed?" 
					+ "\n1. Display all vehicles \n2. Filter \n0. Return to main menu");
			System.out.print("Enter choice: ");
			
			try
			{
				choice = kb.nextInt();
				
				if(choice == 1)
				{
					//display all vehicles method
					System.out.println("Display vehicles.");
				}
				
				else if(choice == 2)
				{
					//filtering method 
					System.out.println("Begin filtering.");
				}
				
				else if(choice == 0)
				{
					break;
				}
				
				else 
				{
					System.out.println("***Invalid Input***");
				}
			} 
			
			catch(InputMismatchException ex) 
			{
				System.out.println("***Invalid Input***");
				kb.next();
			}
		}
		
	}

}
