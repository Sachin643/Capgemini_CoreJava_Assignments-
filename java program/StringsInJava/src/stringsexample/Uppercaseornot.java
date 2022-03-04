package stringsexample;

public class Uppercaseornot {

	    static void shiftuppercase(String m, int length)
	    {
	        String temp = "";
	 
	        for (int i = 0; i < length; ++i) {
	 
	           
	            if (m.charAt(i) >= 65 && m.charAt(i) <= 90) {
	                temp += m.charAt(i);
	            }
	             
	            else
	                System.out.print(m.charAt(i));
	        }
	 
	       
	        System.out.print(temp);
	    }
		    
	    public static void main(String[] args)
	    {
	        String m = "sachin";  
	        int length = m.length();
	 
	        shiftuppercase(m,length);
	    }
	}
