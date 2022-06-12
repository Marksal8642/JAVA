package security;

import java.util.Scanner;

public class Francis {

	public static void main(String[] args) {
		
		int choice;
		
         Scanner mk=new Scanner(System.in);
        for(int s=0; s<3; s++) {
         System.out.println("**enter code**");
         choice=mk.nextInt();
		 
		switch (choice) {
		 case 8642:
			 choice=8642;
			 System.out.println("*you are welcome enter*");
			 break;
		 default:
			 System.out.println("try again");
			 break;		 			 		 
	}   
		 }	
        System.out.println("tho");
	} 
	
}


