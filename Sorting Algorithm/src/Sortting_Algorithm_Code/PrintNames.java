package Sortting_Algorithm_Code;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PrintNames {
	ArrayList<Names> sortednames=new ArrayList();
	String fileName="src\\main\\resources\\sorted-names-list.txt";
	public PrintNames(ArrayList <Names> names){
		this.sortednames=names;
		printOnConsole();
		printOnFile(fileName, this.sortednames);
	}
	
public void printOnConsole() {
	
    for (int i = 0; i < sortednames.size(); i++) {
    	System.out.println(sortednames.get(i).getFirstNamePart() + " " + sortednames.get(i).getSurName() + " " + "\n" );
    }
}
public void printOnFile(String fn, ArrayList<Names> sortedNamesToWrite) {
	 
    FileWriter fw = null;
	try {
		fw = new FileWriter(fn,false);
	} catch (IOException e) {
		e.printStackTrace();
	}
    PrintWriter out = new PrintWriter(fw);
    out.print("");

    for (int i = 0; i < sortedNamesToWrite.size(); i++) {
    	out.println(sortedNamesToWrite.get(i).getFirstNamePart() + " " + sortedNamesToWrite.get(i).getSurName() + " " + "\n" );
    	
    }

    out.close();
}
}
