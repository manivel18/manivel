package rstring;
import java.util.Scanner;
public class reverse {
	public static void main(String[] args)
	{ 
	      String orig, rev="";
	      int i, len;
	      Scanner scan = new Scanner(System.in);
	      //char ch=scan.next Char();
	      System.out.print("Enter a String to Reverse : ");
	      orig = scan.nextLine();
	      
	      len = orig.length();
		  
	      for(i=len-1; i>=0; i--)
	      {
	          rev = rev + orig.charAt(i);
	      }
		  
	        System.out.print("Reverse of Entered String is : " +rev);
	   }
	}

