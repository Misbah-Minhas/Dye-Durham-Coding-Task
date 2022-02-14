package Sorting_Algorithm_Test_Suite;
import static org.junit.Assert.*;
import java.util.ArrayList;
import Sortting_Algorithm_Code.*;
import org.junit.Assert;
import org.junit.Test;
public class Read_Names_Test_Suite {
	ReadNames readnames=new ReadNames();
	
	public String fileName="src\\main\\resources\\unsorted-names-list.txt";
	@Test
	public void test_read_names(String fn) {
		ArrayList <Names> name= new ArrayList<>();
		readnames.readUnsortedName(fn);
		try {
			Names name1=new Names("Marin" , "Alvarez");
			name.add(name1);
			ArrayList<Names> result = readnames.readUnsortedName(fileName);
			Assert.assertEquals(result.get(0).getSurName(), name.get(0).getSurName());
	    } catch(Exception e){
	        fail("got Exception");
	     }	
	}
	
}
