package stringsexample;

import java.util.regex.*;    
import java.util.*;  
public class Emailcheck {
	   
	    public static void main(String args[]){  
	        ArrayList<String> emails = new ArrayList<String>();  
	        emails.add("javaTpoint@domain.co.in");  
	        emails.add("javaTpoint@domain.com");  
	        emails.add("javaTpoint.name@domain.com");  
	        emails.add("javaTpoint#@domain.co.in");  
	        emails.add("javaTpoint@domain.com");  
	        emails.add("javaTpoint@domaincom");  
	        emails.add("@yahoo.com");  
	        emails.add("javaTpoint#domain.com");  
	        String regex = "^(.+)@(.+)$";    
	        Pattern pattern = Pattern.compile(regex);    
	        for(String email : emails)
	        {     
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  
	    }  
	}  
