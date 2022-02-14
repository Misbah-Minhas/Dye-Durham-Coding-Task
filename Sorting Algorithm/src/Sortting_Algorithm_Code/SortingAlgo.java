package Sortting_Algorithm_Code;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingAlgo {
PrintNames printname;
public ArrayList<Names> sortedNames(ArrayList <Names> UnsorrtedNames){

	  ArrayList <Names> newNameArray=new ArrayList<Names>();
	  String word=UnsorrtedNames.get(0).getSurName();
	    int min;
	    int pos;

	    while(!UnsorrtedNames.isEmpty())
	    {
	        word=UnsorrtedNames.get(0).getSurName();
	        min=0;
	        pos=0;

	        for(int i=0; i<UnsorrtedNames.size(); i++)
	        {
	            if(word.compareTo(UnsorrtedNames.get(i).getSurName())<min)
	            {
	                word=UnsorrtedNames.get(i).getSurName();
	                min=word.compareTo(UnsorrtedNames.get(i).getSurName());
	                pos=i;
	            }
	        }
	        newNameArray.add(0, UnsorrtedNames.remove(pos));
	    }
	    UnsorrtedNames=newNameArray;	
	    return UnsorrtedNames;
	
	  
	  
	
}


}
