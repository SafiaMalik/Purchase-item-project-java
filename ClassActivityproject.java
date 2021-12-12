import java.util.Scanner;

public class ClassActivityproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int total=0;
     int quantity=0;
     int price=0;
      String name = "";
		// we can make fixe price for each item in store and then use if and if else for each item, use quntity and price for 
    //each item seprately then at the encd do total
		Scanner keyboard= new Scanner(System.in);
		
		String answer = "Yes";
	
		while(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("What Item you want");
			
			name = keyboard.next(); 
         System.out.println("price is");
			
			price = keyboard.nextInt();
			
			System.out.println("how much quantity?");
			
			quantity = keyboard.nextInt();	
			
			
			
			System.out.println("My item is " + name + " and my quantity is " + quantity+ "my price is" + price);
			
			System.out.println("Do you want to continue?");
			
			answer = keyboard.next();
			//if(!(answer.equalsIgnoreCase("yes")))
					
					total=total+(quantity*price);
            // break; break not needed for while
			
		}
		System.out.println(total);
	
		keyboard.close();
	}

}
