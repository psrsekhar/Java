/*
 * This file is part of SSolutions framework.
 * File creation date: 29-Dec-2017
 */
package practice.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Sairam Sekhar P
 * @date 29-Dec-2017
 * 
 * Java LinkedList class uses doubly linked list to store the elements. 
 * It provides a linked-list data structure. 
 * It inherits the AbstractList class and implements List and Deque interfaces.
 * The important points about Java LinkedList are:
 *		1) Java LinkedList class can contain duplicate elements.
 *		2) Java LinkedList class maintains insertion order.
 *		3) Java LinkedList class is non synchronized.
 *		4) In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
 *		5) Java LinkedList class can be used as list, stack or queue.
 * 
 * Implementation : Java LinkedList class extends AbstractSequentialList class and implements List and Deque interfaces. 
 * 
 * Doubly Linked List : In case of doubly linked list, we can add or remove elements from both side.
 */
public class LinkedLists
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Creating user-defined class objects
		Employee firstEmployee = new Employee("SS01001", "Sairam Sekhar P", 25000.0f, "Dev");
		Employee secondEmployee = new Employee("SS01002", "Sairam", 21467.0f, "Dev");
		Employee thirdEmployee = new Employee("SS02003", "Sekhar", 65421.0f, "Db");
		Employee fourthEmployee = new Employee("SS03004", "P", 43135.0f, "Db");
		Employee fifthEmployee = new Employee("SS03005", "ABCDE", 67820.0f, "Net");
		
		// Adding user-defined objects into LinkedList
		List<Employee> list = new LinkedList<Employee>();
		
		// Adding objects into LinkedList
		list.add(firstEmployee);
		list.add(secondEmployee);
		list.add(thirdEmployee);
		list.add(fourthEmployee);
		list.add(fifthEmployee);

		// Size of LinkedList : number of objects in LinkedList
		System.out.println("Size of Linked List is : " + list.size());

		// Reading data from objects in ArrayList using ListIterator Interface
		ListIterator<Employee> iterator = list.listIterator();
		
		//Traversing data from forward direction
		System.out.println("...........Traversing data from forward direction...........");
		while (iterator.hasNext())
		{
			Employee employee = iterator.next();
			System.out.println("Employee Id : " + employee.employeeId + "\t Name : " + employee.name + "\t Salary : " + employee.salary + "\t Department : " + employee.department);
		}
		
		//Traversing data from backward direction
		System.out.println("\n...........Traversing data from backward direction...........");
		while (iterator.hasPrevious())
		{
			Employee employee = iterator.previous();
			System.out.println("Employee Id : " + employee.employeeId + "\t Name : " + employee.name + "\t Salary : " + employee.salary + "\t Department : " + employee.department);
		}		
	}
}