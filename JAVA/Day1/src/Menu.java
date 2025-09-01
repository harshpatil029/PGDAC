/*Write Java program - 
Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 0 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option(0) , display total bill & exit.
*/
import java.util.Scanner;

class Menu{

	public static void main(String args[]){
		int dosaprice= 80;
		int samosaprice=20;
		int idliprice=40;
		int quantity;
		int caluculate=0;

		Scanner sc= new Scanner(System.in);

		boolean flag= false;
		System.out.println("MENU 1. DOSA 2. SAMOSA 3. IDLI");
		while(!flag){
			System.out.println("Enter choice");
			switch(sc.nextInt())	{
				case 1:
				System.out.println("Enter quantity");	
				quantity=sc.nextInt();
				caluculate = (dosaprice* quantity)+caluculate;
	
				break;
				case 2:
				System.out.println("Enter quantity");	
				quantity=sc.nextInt();
				caluculate = (samosaprice* quantity)+caluculate;
	
				break;
				case 3:
				System.out.println("Enter quantity");	
				quantity=sc.nextInt();	
				caluculate = (idliprice* quantity)+caluculate;

				break;
				
				default :
				System.out.println("You entered wrong choice, total bill "+caluculate);
				flag= true;
				break;


			}
	

		}

	}


}