package main;

import java.text.ParseException;
import java.util.ArrayList;

import model.Person;
import stoogesort.StoogeSortProcess;
import util.DefineValues;
import util.ShowProcess;

public class Main {

	private static ArrayList<Person> personList = new ArrayList<>();
	private static ArrayList<Person> sortedpersonList = new ArrayList<>();
	
	public static void main(String[] args) throws ParseException {
		
		
		personList = DefineValues.defineValues(personList);
		
		
		System.out.println("---------------------------------");
		System.out.println("BEFORE STOOGE SORT byId");
		ShowProcess.showValues(personList);	
		

		System.out.println("AFTER STOOGE SORT byId");
		StoogeSortProcess.byId(personList);	
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE STOOGE SORT byLastName");		
		ShowProcess.showValues(personList);				
		
		System.out.println("AFTER STOOGE SORT byLastName");
		StoogeSortProcess.byLastName(personList);	
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE STOOGE SORT byName");
		ShowProcess.showValues(personList);

		System.out.println("AFTER STOOGE SORT byName");
		StoogeSortProcess.byName(personList);
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE STOOGE SORT byAge");		
		ShowProcess.showValues(personList);

		System.out.println("AFTER STOOGE SORT byAge");
		StoogeSortProcess.byAge(personList);
		System.out.println("---------------------------------");
		
		System.out.println("BEFORE STOOGE SORT byRegisterDate");		
		ShowProcess.showValues(personList);

		System.out.println("AFTER STOOGE SORT byRegisterDate");
		StoogeSortProcess.byRegisterDate(personList);
		System.out.println("---------------------------------");
	}
}
