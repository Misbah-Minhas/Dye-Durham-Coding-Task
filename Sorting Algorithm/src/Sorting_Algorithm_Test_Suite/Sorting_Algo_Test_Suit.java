package Sorting_Algorithm_Test_Suite;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import Sortting_Algorithm_Code.*;
public class Sorting_Algo_Test_Suit {
	public ArrayList <Names> UnsortedNames= new ArrayList<>();
	SortingAlgo sortingalgo=new SortingAlgo();
	
	public ArrayList <Names> sorted= new ArrayList<>();
	@Test
	public void sortingAlgoTest() {
		Names name1=new Names("Janet","Parsons");
		Names name2=new Names("Vaughn","Lewis");
		Names name3=new Names("Adonis Julius","Archer");
		UnsortedNames.add(name1);
		UnsortedNames.add(name2);
		UnsortedNames.add(name3);
		sorted.add(name3);
		sorted.add(name2);
		sorted.add(name1);
		ArrayList <Names> sortedResultNames=sortingalgo.sortedNames(UnsortedNames);		
		Assert.assertEquals(sorted, sortedResultNames);
	}
}
