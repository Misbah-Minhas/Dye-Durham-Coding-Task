package Sorting_Algorithm_Test_Suite;
import Sortting_Algorithm_Code.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Print_Names_Test_Suite {

public ArrayList <Names> UnsortedNames= new ArrayList<>();
String fileName="src\\main\\resources\\unsorted-names-list.txt";
ReadNames readnames=new ReadNames();


Names name1=new Names("Janet","Parsons");
Names name2=new Names("Vaughn","Lewis");
Names name3=new Names("Adonis Julius","Archer");


PrintNames printnames=new PrintNames(UnsortedNames);

	@Test
	public void testPrintNamesOnFile() {
		UnsortedNames.add(name1);
		UnsortedNames.add(name2);
		UnsortedNames.add(name3);
		printnames.printOnFile(fileName, UnsortedNames);
		ArrayList<Names> result = readnames.readUnsortedName(fileName);
		Assert.assertEquals(result.get(0).getSurName(), UnsortedNames.get(0).getSurName());
	}
	

}
