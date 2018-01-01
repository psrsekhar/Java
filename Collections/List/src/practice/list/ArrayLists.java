/*
 * This file is part of SSolutions framework.
 * File creation date: 29-Dec-2017
 */
package practice.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Sairam Sekhar P
 * @date 29-Dec-2017
 * 
 * Java ArrayList class uses a dynamic array for storing the elements. 
 * It inherits AbstractList class and implements List interface.
 * The important points about Java ArrayList class are:
 *		1) Java ArrayList class can contain duplicate elements.
 *		2) Java ArrayList class maintains insertion order.
 *		3) Java ArrayList class is non synchronized.
 *		4) Java ArrayList allows random access because array works at the index basis.
 *		5) In Java ArrayList class, manipulation is slow because a lot of shifting needs to be occurred if any element is removed from the array list.
 * 
 * Implementation :
 * Java ArrayList class extends AbstractList class which implements List interface. 
 * The List interface extends Collection and Iterable interfaces in hierarchical order.
 */
public class ArrayLists
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// User-defined class objects in Java ArrayList
		Employee firstEmployee = new Employee("SS01001", "Sairam Sekhar P", 25000.0f, "Dev");
		Employee secondEmployee = new Employee("SS01002", "Sairam", 21467.0f, "Dev");
		Employee thirdEmployee = new Employee("SS02003", "Sekhar", 65421.0f, "Db");
		Employee fourthEmployee = new Employee("SS03004", "P", 43135.0f, "Db");
		Employee fifthEmployee = new Employee("SS03005", "ABCDE", 67820.0f, "Net");

		// Adding user-defined objects into ArrayList
		ArrayList<Employee> arrayList = new ArrayList<Employee>();

		// Adding objects into ArrayList
		arrayList.add(firstEmployee);
		arrayList.add(secondEmployee);
		arrayList.add(thirdEmployee);
		arrayList.add(fourthEmployee);
		arrayList.add(fifthEmployee);

		// Size of ArrayList : number of objects in ArrayList
		System.out.println("Size of Array List is : " + arrayList.size());

		// Reading data from objects in ArrayList
		Iterator<Employee> iterator = arrayList.iterator();
		while (iterator.hasNext())
		{
			Employee employee = iterator.next();
			System.out.println("Employee Id : " + employee.employeeId + "\t Name : " + employee.name + "\t Salary : " + employee.salary + "\t Department : " + employee.department);
		}
	}
}