package stoogesort;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

import model.Person;
import util.ShowProcess;

public class StoogeSortProcess {

	private static ArrayList<Person> sortedpersonList = new ArrayList<>();
	private static Person[] sortedPersonArray = null;

	public static void byId(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				return Long.compare(p0.getId(), p1.getId());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = stoogesort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	public static void byLastName(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				Collator collator = Collator.getInstance(new Locale("tr", "TR"));
				return collator.compare(p0.getLastname(), p1.getLastname());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = stoogesort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	public static void byName(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				Collator collator = Collator.getInstance(new Locale("tr", "TR"));
				return collator.compare(p0.getName(), p1.getName());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = stoogesort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	public static void byAge(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				return Integer.compare(p0.getAge(), p1.getAge());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = stoogesort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	public static void byRegisterDate(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				if (p0.getRegisterDate().before(p1.getRegisterDate())) {
					return -1;
				} else if (p0.getRegisterDate().after(p1.getRegisterDate())) {
					return 1;
				} else {
					return 0;
				}
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = stoogesort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	private static Person[] convertListToArray(ArrayList<Person> personList) {
		Person[] persons = personList.toArray(new Person[personList.size()]);
		return persons;
	}

	private static ArrayList<Person> convertArrayToList(Person[] persons) {
		ArrayList<Person> personList = new ArrayList<>(Arrays.asList(persons));
		return personList;
	}

	private static Person[] stoogesort(Person[] a, Comparator comp) {

		int l = 0;
		int h = a.length-1;

		Person[] sortedArray = stoogesort(a, l, h, comp);
		return sortedArray;
	}

	private static Person[] stoogesort(Person[] a, int l, int h, Comparator comp) {

		if (l >= h)
			return null;

		if (greaterThan(comp, a[l], a[h])) {
			Person t = a[l];
			a[l] = a[h];
			a[h] = t;
		}

		if (h - l + 1 > 2) {
			int t = (h - l + 1) / 3;

			// Recursively sort first 2/3 elements
			stoogesort(a, l, h - t, comp);

			// Recursively sort last 2/3 elements
			stoogesort(a, l + t, h, comp);

			// Recursively sort first 2/3 elements
			// again to confirm
			stoogesort(a, l, h - t, comp);
		}

		return a;
	}

	// ASC
	private static boolean greaterThan(Comparator comp, Person x, Person y) {
		return comp.compare(x, y) > 0;
	}

	// DESC
	private static boolean lessThan(Comparator comp, Person x, Person y) {
		return comp.compare(x, y) < 0;
	}
}
