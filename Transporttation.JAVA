package Transportation;

import java.util.Scanner;

public class Freetown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rental_purpose();
		//provences();
		//freetown();
	}
  public static void freetown() {
	  Scanner mk=new Scanner(System.in);
	  String name,location,destination,talk;
	  
	  System.out.println("welcome you are Booking within freetown");
	  System.out.println(" name please");
	  name=mk.next();
	  System.out.println("can we have your location please");
	  location=mk.next();
	  System.out.println("were do you want to go\n within freetown");
	  System.out.println("1:western or\n2:eastern");
	  System.out.println("enter a number");
	  int choice=mk.nextInt();
	  int western=1,eastern=2;
	  int choice1=1;
	  int choice2=2;
	  switch (choice) {
	  case 1:
		choice1=western;
		System.out.println("which part do you want to go within western area");
		System.out.println("1:godreich=10,000\n2:lumely=5,000\n3:Abadeen road=10,000");
		System.out.println("enter a number");
		talk=mk.next();
		time();
		ride();
		payment();
		System.out.println("do you want to book,for another person");
		fquitc();
		break;
	  case 2:
		  choice2=eastern;
		  System.out.println("which part do you want to go within eastern area");
		  System.out.println("1:kissy=5,000\n2:calabatown=5,000\n3:waterloo=10,000");
		  System.out.println("enter number");
		  talk=mk.next();
		  time();
		  ride();
		  payment();
		  System.out.println("do you want to book,for another person");
		  fquitc();
		  break;
	  default:
		  System.out.println("you enter wrong number");
		  break;
	  }
  }
 private static void time() {
	 Scanner mk=new Scanner(System.in);
	 String talk;
	 int choice;
  System.out.println("when would like to live\n in the");
	System.out.println("1:morning hour or\n2:evening hour");
	System.out.println("enter number");
	choice=mk.nextInt();
	
	int choice1=1;
	int choice2=2;
	switch (choice) {
	case 1:
		choice=1;
		System.out.println("time please\n1:*6:00am*\n2:*7:00am*\n3:*8:00am*");
		System.out.println("enter a number");
		talk=mk.next();
		System.out.println("we will be there prompt as you say");
		break;
	case 2:
		choice=2;
		System.out.println("time please\n1:*6:00pm*\n2:*7:00pm*\n3:*8:00pm*");
		System.out.println("enter a number");
		talk=mk.next();
		System.out.println("we will be there prompt as you say");
		break;
	default:
		System.out.println("you enter wrong number");
		break;
	}
	
 }
 private static void ride(){
	 Scanner mk=new Scanner(System.in);
	 String talk;
	 int choice=0;
	 System.out.println("what would you like to ride with");
	 System.out.println("1:car\n2:bike\n3:keke");
	 choice=mk.nextInt();
	 int car=1,bike=2,keke=3;
	 int choice1=1;
	 int choice2=2;
	 int choice3=3;
	 switch (choice) {
	 case 1:
		 choice1=car;
		 System.out.println("ok");
		 break;
	 case 2:
		 choice2=2;
		 System.out.println("great");
		 break;
	 case 3:
		 choice3=3;
		 System.out.println("good");
		 break;
		 default:
			 System.out.println("you enter wrong number");
			 break;
	 }
 }
 private static void payment() {
	 Scanner mk=new Scanner(System.in);
	 String talk;
	 
	 System.out.println("you can make a payment by");
	 System.out.println("1:cash(through our agent)\n2:Orange money\n3:Bank");
	 System.out.println("enter a number");
	int choice=mk.nextInt();
	 int cash=1,Orange_money=2,Bank=3;
	 //int choice1=1;
	 //int choice2=2;
	 //int choice3=3;
	 switch (choice) {
	 case 1:
		 choice=1;
		 System.out.println("make payment throug our agent at jui juction main highway if you are in the east, or call this number for direction (*031468668)");
		 System.out.println("or if you are in the west lumely by the round about");
		 System.out.println("nice doing business with you");
		 break;
	 case 2:
		 choice=2;
		 System.out.println("send it through this number(*074425418)");
		 System.out.println("take care costomer");
		 break;
	 case 3:
		 choice=3;
		 System.out.println("this is how account number: 987650023 at union trust bank/ any commercial bank nation wide");
		 System.out.println("thank you costomer");
		 break;
	 } 
 }
 public static void provences() {
	 Scanner mk=new Scanner(System.in);
	 String name,location,talk;
	 System.out.println("your Booking for the provences");
	 System.out.println("your name please");
	 name=mk.next();
	 System.out.println("were do you live");
	 location=mk.next();
	 System.out.println("");
	 System.out.println("were do you want to go out of freetown\n1:northern provences\n2:sourthern provences");
	 int choice=mk.nextInt();
	 int northern_provences=1,sourthern_provences=2;
	 //int choice1=1;
	 //int choice2=2;
	 switch (choice) {
	 case 1:
		 choice=1;
		 System.out.println("which part on the north");
		 System.out.println("1:Makeni=50,000\n2:Kono=60,000\n3:Kailiahum=100,000");
		 talk=mk.next();
		 provencial();   
		 diven();
		 pment();
		 break;
	 case 2:
		 choice=2;
		 System.out.println("which part on the sourth");
		 System.out.println("1:Bo=40,000\n2:Kenema=50,000\n3:pujehum=70,000");
		 talk=mk.next();
		 provencial();
		 diven();
		 pment();
		 break;
	 default:
		 System.out.println("you enter wrong number");
		 break;
		 
	 }
 }
 private static void provencial() {
	 Scanner mk=new Scanner(System.in);
	 System.out.println("when would you wants us to live");
	 System.out.println("In the\n1:Morning hour or\n2:Evening hour");
	 int choice=mk.nextInt();
	 int morning=1,evening=2;
	 switch (choice) {
	 case 1:
		  choice=morning;
		  System.out.println("time please\n1:*6:00am*\n2:*7:00am*\n3:*8:00am");
		  choice=mk.nextInt();
		  System.out.println("noted");
		  break;
	 case 2:
		 choice=evening;
		 System.out.println("time please\n1:*6:00pm*\n2:*7:00pm*\n3:*8:00pm");
		 choice=mk.nextInt();
		 System.out.println("noted");
		 break;
	 default:
		 System.out.println("you enter wrong number");
		 break;
	 }
 }
 private static void diven() {
	 Scanner mk=new Scanner(System.in);
	 System.out.println("In what way do you want be drive");
	 System.out.println("like......");
	 System.out.println("1:Express\n2:Normall");
	 int choice=mk.nextInt();
	 int express=1,normall=2,quite=3;
	 switch (choice) {
	 case 1:
		 choice=1;
		 System.out.println("noted");
		 break;
	 case 2:
		 choice=2;
		 System.out.println("noted");
	 case 3:
		 choice=3;
		 System.out.println("thanks");
		 break;
	 default:
		 System.out.println("you enter wrong number");
		 break;
	 }
			 
 }
 private static void pment() {
	 Scanner mk=new Scanner(System.in);
	 System.out.println("how do you want to make payment");
	 System.out.println("1:cash\n2:Bank\n3:Orange money");
	 int choice=mk.nextInt();
	 int cash=1,bank=2,orange_money=3;
	 switch (choice) {
	 case 1:
		 choice=cash;
		 System.out.println("contact our agent through this number (05462)");
		 System.out.println("thanks");
		 break;
	 case 2:
		 choice=bank;
		 System.out.println("this is our Account number(09874)in all salone commercial bank");
		 System.out.println("good doing business with you");
		 break;
	 case 3:
		 choice=orange_money;
		 System.out.println("send it to this orange money number(074425418)");
		 System.out.println("thanks");
		 break;
	 }
 }
 public static void Rental_purpose() {
	 int choice=0;
	 Scanner mk=new Scanner(System.in);
	     System.out.println("were do u you want to go\n1:In the provence or \n2:within freetown");
	     choice=mk.nextInt();
	     switch (choice) {
	     case 1:
	    	 System.out.println("welcome to the provences");
	    	 provences();
	    	 break;
	     case 2:
	    	 System.out.println("welcome, within freetown");
	    	 freetown();
	    	 break;
	    default:
	    	System.out.println("u enter wrong option");
	    	break;
 }
 }
 public static void fquitc() {
	 int choice;
	 Scanner ff=new Scanner(System.in);
	 System.out.println("1:yes\n2:no");
	 choice=ff.nextInt();
	 choice=1;
	 choice=2;
	 switch (choice) {
	 case 1:
		 choice=1;
		 freetown();
		 System.out.println("thanks");
		 
	 case 2:
		 choice=2;
		 System.out.println("ok, nice doing business with you");
	 }
 }
 public static void reEnter() {
	 
	 int choice;
	 System.out.println("1.do you want to start again\n2.or you want to quit");
	 Scanner re=new Scanner(System.in);
	 choice=re.nextInt();
	 choice=1;
	 choice=2;
	 switch (choice) {
	 case 1:
		System.out.println();
			  
	 
	 }
 }
 public static void toquit() {
	 Scanner mk=new Scanner(System.in);
	  String name,location,destination,talk;
	  
	   
 }
}