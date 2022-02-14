package Sortting_Algorithm_Code;

import java.util.ArrayList;

public class SortNames {
	public static void main(String[] args) {
		
		String fileName="src\\main\\resources\\unsorted-names-list.txt";
		ReadNames names= new ReadNames();
		ArrayList<Names> unsortednames=names.readUnsortedName(fileName);
		SortingAlgo sortingalgo=new SortingAlgo();
		ArrayList<Names> sortednames=sortingalgo.sortedNames(unsortednames);
		PrintNames printnamesn=new PrintNames(sortednames);

	}
}
