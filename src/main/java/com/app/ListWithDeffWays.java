package com.app;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ListWithDeffWays {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Evoke");
		list.add("Madhuri");
		list.add("Surya");
		list.add("Sai");
		list.add("Hyd");
		list.add("Balram");
		list.add("Bhavani");
		list.add("Pavan");
		list.add("Sharath");

		
		System.out.println("the list elements are" + list);

		System.out.println("Iterating by listIterator method one by one");
		ListIterator<String> ls = list.listIterator();
		while (ls.hasNext()) {
			System.out.println("iterating list by iterator   =" + ls.next());
		}
		
		System.out.println("by using for each loop");
		for (String names: list) {
			System.out.println("retriving elements one by one"+names);
		}

		System.out.println("By java 1.8 unsing streams");
		list.stream().collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("By Using Lambda Expression");
		list.forEach(name->System.out.println(name));

		System.out.println("Names starts with B letter");
		list.stream().filter(s -> s.startsWith("B")).collect(Collectors.toList()).forEach(System.out::println);

		String remove= list.remove(3);
		System.out.println("Specific element removing from list collection is ="+remove);
	}

}
