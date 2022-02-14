package Sortting_Algorithm_Code;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.*;
import java.io.*;  
import java.util.Scanner;  
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReadNames {
	String fullName="";
	String firstName="";
	String middleName="";
	String surName="";
	public ArrayList <Names> name= new ArrayList<>();
	BufferedReader nameReader=null;
    StringTokenizer tokenizer=null;
    Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
    public ArrayList<Names> readUnsortedName(String fileName) {
    	File tempFile = new File(fileName);
    	boolean exists = tempFile.exists();
    	if(exists==true) {
    	    try{
    	    	nameReader=new BufferedReader(new FileReader(fileName));
    	        if(nameReader.ready())
    	        {
    	            while((fullName=nameReader.readLine())!=null)
    	            {
    	            	fullName = fullName.trim();
    	            	Matcher m = p.matcher(fullName);
    	            	boolean res = m.find();
    	            	
    	            	if (!res && !fullName.equals(""))
    	            	{
    	            		if (!fullName.contains(" "))
    	            		{
    	            			name.add(new Names(" ", fullName));
        	            	}	
    	            		else 
    	            		{
    	            			String[] parts = fullName.split(" ");
    	            			String lastWord = parts[parts.length - 1];
    	            			String otherWord = parts[parts.length - 1];
    	            			int index = fullName.lastIndexOf(" ");
    	            			name.add(new Names(fullName.substring(0, index), fullName.substring(index+1)));
    	            		}
    	            	}
    	            } 
    	        }
    	        else {
    	        	System.out.println("File Do not contain names, Please add names to sort" );
    	        	System.exit(0);
    	        }
    	    }
    	    catch(Exception e){
    	    	System.out.println(e.getMessage());
    	    }
    	}
    	else {
    		System.out.println("No File Exist on this Path , Please check file or path");
    		System.exit(0);
    		}
    
    	 return name;

    	}

}