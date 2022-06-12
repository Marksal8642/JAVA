package jack;

public class Class1 {
    public static String Pname;
   public  static String Pcolor;
    public static char Psize;
      
     Class1(String newPname,String newPcolor,char newPsize ){
    	 Pname=newPname;
    	 Pcolor=newPcolor;
    	 Psize=newPsize;
     }
      
  public static void setPname(String newPname) {
	  Pname=newPname;
  }
  public static void setPcolor(String newPcolor) {
	  Pcolor=newPcolor;
  }
  public static void setPsize(char newPsize) {
	   Psize=newPsize; 
  }
}
  
