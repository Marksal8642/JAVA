package police;

import java.util.Scanner;

public class Security {

	
	
	public static void main(String[] args) {
		// 
		starting();
		//clientdetails();
		//reportagaintothepolice(); 
		//reportpolice();
		//reportpoliceagain();
		//securitypart();
		

	}
public static void clientdetails() {
	String [] details={"name","location","problem"};
	//String [] PROBLEM= {"rubbery","raiot","rape","fighting","landcase"};
	
	Scanner mk=new Scanner(System.in);
	System.out.println("please enter your name");
	String NAME=mk.next();
	System.out.println("were do you live");
	String LOCATION=mk.next();
	System.out.println("*what do you want to report for");
	System.out.println("1:rubbery\n2:raiot\n3:rape\n4:fighting && landcase");
	System.out.println("*enter the number you want to report for");
	int choice=mk.nextInt();
	int rubbery =1,raiot=2,rape=3,fighting=4;
	int choice1=rubbery;
	int choice2=raiot;
	int choice3=rape;
	int choice4=fighting;
	switch (choice) {
	case 1:
		choice=rubbery;
		System.out.println("we will send some inspectors");
		break;
	case 2:
		 choice2=raiot;
		 System.out.println("keep away from that premisese");
		 System.out.println("we will send some OSD");
		 break;
	case 3:
		choice3=rape;
		System.out.println("we will send some LUC there");
		break;
	case 4:
		 choice4=fighting;
		 System.out.println("we will send you some OSD ");
		 break;
	default:  
		 System.out.println("you enter invalid numer of report");
		 break;
	}
	reportagaintothepolice();
	System.out.println();
}
public static void reportpolice() {
	  String name,Address,police,number,crime;
	  //int choice;
	  String talk;
      Scanner mk=new Scanner(System.in);
      System.out.println("*welcome to the CID department*");
      System.out.println("here we take matters seriously");
      System.out.println("enter you name please");
      name=mk.next();
      System.out.println("enter your address");
      Address=mk.next();
      System.out.println("enter the surename of the police you want to report");
      police=mk.next();
      System.out.println("enter the number of the police(police number), that you want to report");
      number=mk.next();
      System.out.println("*what crime the police has commited");
      System.out.println("1:corruption\n2:Briberry\n3:Stealing\n4:inpersonate");
      System.out.println("enter a number");
      //crime=mk.next();
      int choice=mk.nextInt();
      int corruption=1,briberry=2,stealing=3,inpersonate=4;
      int choice1=1;
      int choice2=2;
      int choice3=3;
      int choice4=4;
      switch (choice) {
      case 1:
    	  choice1=corruption;
    	  System.out.println("do you have proof");
    	  System.out.println("please call this number 911");
    	  System.out.println("you asr a good citizing thanks");
    	  break;
      case 2:
    	  choice2=briberry;
    	  System.out.println("what is the proof");
    	  talk=mk.next();
    	  System.out.println("please call this number (911)");
    	  System.out.println("thank you");
    	  break;
      case 3:
    	  choice3=stealing;
    	  System.out.println("what did he/she steal");
          talk=mk.next();
          System.out.println("thanks for repoting");
          break;
      case 4:
    	  choice4=inpersonate;
    	  System.out.println("with what rank/position");
    	  talk=mk.next();
    	  System.out.println("the law will talk it cause");
    	  break;
      default:
    	  System.out.println("you enter invalid number");
    	  break;
    	  
      }
      reportpoliceagain();
      //System.out.println("thank you for reporting, the law will take it cause");
}
public static void reportagaintothepolice() {
	 Scanner mk=new Scanner(System.in);
	 int choice, num;
	 System.out.println("do you have another report");
	 System.out.println("1:yes or\n2:no");
	 choice=mk.nextInt();
	 int choice1=1;
	 int choice2=2;
	 switch (choice) {
	 case 1:
		 choice1=1;
	    // System.out.println("please enter value in number");
	    // num=mk.nextInt();
	    // int choice=mk.nextInt();
	     againforS();
	     break;
	 case 2:
		  choice2=2;
		  System.out.println("thank you");
		  break;
	 }
}
public static void againforS() {
	Scanner mk=new Scanner(System.in);
	System.out.println("*what do you want to report for");
	System.out.println("1:rubbery\n2:raiot\n3:rape\n4:fighting && landcase");
	System.out.println("*enter the number you want to report for");
	int choice=mk.nextInt();
	int rubbery =1,raiot=2,rape=3,fighting=4;
	int choice1=rubbery;
	int choice2=raiot;
	int choice3=rape;
	int choice4=fighting;
	switch (choice) {
	case 1:
		choice=rubbery;
		System.out.println("we will send some inspectors");
		break;
	case 2:
		 choice2=raiot;
		 System.out.println("keep away from that premisese");
		 System.out.println("we will send some OSD");
		 break;
	case 3:
		choice3=rape;
		System.out.println("we will send some LUC there");
		break;
	case 4:
		 choice4=fighting;
		 System.out.println("we will send you some OSD ");
		 break;
	default:
		 System.out.println("you enter invalid numer of report");
		 break;
	
	}	
}
private static void reportpoliceagain() {
	   Scanner mk=new Scanner(System.in);
	   for(int m=0; m<2; m++) {
	   int choice, num;
	   String comment;
	   System.out.println("*do you have another report or comment *");
	   System.out.println("if you do, respone to this instruction*");
	   System.out.println("1:yes or\n2:no\n3:comment/corncern");
	   System.out.println("enter a number");
		 choice=mk.nextInt();
		 int choice1=1;
		 int choice2=2;
		 int choice3=3;
		 switch (choice) {
		 case 1:
			 choice1=1;
			 reportagain();
			 break;
		 case 2:
			 System.out.println("*thank you*");
			 break;
		 case 3:
			 System.out.println("write you comment/corncern here");
			 comment=mk.next();
			 System.out.println("thank you");
			 break;
		 }		 
		 }
}
public static void reportagain() {
	String talk;
	Scanner mk=new Scanner(System.in);
	System.out.println("*what do you want to report again*");
	System.out.println("1:corruption\n2:Briberry\n3:Stealing\n4:inpersonate");
    System.out.println("enter a number");
    //crime=mk.next();
    int choice=mk.nextInt();
    int corruption=1,briberry=2,stealing=3,inpersonate=4;
    int choice1=1;
    int choice2=2;
    int choice3=3;
    int choice4=4;
    switch (choice) {
    case 1:
  	  choice1=corruption;
  	  System.out.println("do you have proof");
  	  System.out.println("please call this number");
  	  System.out.println("you asr a good citizing thanks");
  	  break;
    case 2:
  	  choice2=briberry;
  	  System.out.println("do you have proof");
  	  talk=mk.next();
  	  System.out.println("please call this number (911)");
  	  System.out.println("thank you");
  	  break;
    case 3:
  	  choice3=stealing;
  	  System.out.println("what did he/she steal");
        talk=mk.next();
        System.out.println("thanks for repoting");
        break;
    case 4:
  	  choice4=inpersonate;
  	  System.out.println("with what rank/position");
  	  talk=mk.next();
  	  System.out.println("the law will talk it cause");
  	  break;
    default:
  	  System.out.println("you enter invalid number");
  	  break;
  	  
    }
    
}
public static void starting() {
	int choice=0;
	String talk;
	Scanner mk=new Scanner(System.in);
	System.out.println("*wellcome to the complainnante of the force*");
	System.out.println("*what you want to report:\n1:Report a crime or\n2:Report a police");
	System.out.println("enter the number");
	choice=mk.nextInt();
	int crime=1,police=2;
	int choice1=1;
	int choice2=2;
	switch (choice) {
	case 1:
		choice1=crime;
		clientdetails();
		break;
	case 2:
		choice2=police;
		reportpolice();
		break;
	case 3:
		System.out.println("*you enter invalid number*");
		break;
	}
	
}
}
