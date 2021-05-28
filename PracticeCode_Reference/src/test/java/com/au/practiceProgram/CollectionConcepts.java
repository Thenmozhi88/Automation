package com.au.practiceProgram;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class CollectionConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionConcepts cc=new CollectionConcepts();
		//cc.arrayListMethod();
		cc.LinkedListMethod();
		//cc.HashSetMethod();
		//cc.LinkedHashSetMethod();
		//cc.TreeSetMethod();
		//cc.HashMapMethod();
	//	cc.TreeMapMethod();
	}
	/*	public void arrayListMethod() {
			
			//ArrayList
			//1. Allows duplicate values
			//2. Implements resizable architecture
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Hello");
		a.add("Java");
		a.add("Welcome");
		a.add("Java");
		
		ArrayList<String> b=new ArrayList<String>();
		b.add("121");
		b.add("132");
		b.add("121");
		b.add("1");
		
		a.addAll(b);
		
		System.out.println("Arraylist values" + " " + a.size());
		Collections.sort(a);
		
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
		
		Iterator it=a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
		*/
		public void LinkedListMethod() {
			//LinkedList
			//1. Allows duplicate values
			//2. Implements DoublyLinkedList architecture
			LinkedList<Integer> ll=new LinkedList();
			ll.add(123);
			ll.add(321);
			ll.add(456);
			ll.add(151);
			ll.add(111);
			
			/*
			 * for(int x:ll) { System.out.println(x); }
			 */
			
			Iterator<Integer> it=ll.iterator();
			while(it.hasNext()) {
				int i=it.next();
				if(i>=321) {
					System.out.println(i);
				}
			}
			
		}
		
		public void HashSetMethod() {
			//HashSet will not allows duplicate values
			//Allows only one null value
			//print output in a random order
			
			HashSet<String> hs=new HashSet<String>();
			hs.add("I");
			hs.add("am");
			hs.add("am");
			hs.add("implements");
			hs.add("Set");
			hs.add("Set");
			hs.add("Interface");
			
			Iterator<String> it=hs.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		}
		
		public void LinkedHashSetMethod() {
			
			//LinkedHashSet will not allows duplicate values
			//Allows only one null value
			//print output in a insertion order
			
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(65);
		lhs.add(45);
		lhs.add(23);
		lhs.add(0);
		lhs.add(null);
		lhs.add(85);
		lhs.add(null);
		
		
		Iterator<Integer> it=lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		}
		
		public void TreeSetMethod() {
			//TreeSet will not allows duplicate values
			//Not allow null value
			//print output in a ascending order
			
			TreeSet<String> ts=new TreeSet<String>();
			ts.add("Interface");
			ts.add("Set");
			ts.add("Under");
			ts.add("Comes");
			ts.add("Treeset");
			
			
			Iterator<String> it=ts.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		}
		
		public void HashMapMethod() {
			//Map is key and value pair
			//It will not allows duplicate keys, but allows duplicate values
			//It will allows null keys and values
			
			HashMap<Integer,String> hm=new HashMap<Integer,String>();
			hm.put(101, "Tamil");
			hm.put(102, "English");
			hm.put(103, "Maths");
			hm.put(104, "Science");
			hm.put(105, "History");
			hm.put(106, "History");
			hm.put(107, "Abacus");
			hm.put(101, "Hindi");
			hm.put(null, "sdf");
			hm.put(null, null);
			
		/*	for(Integer x: hm.keySet()) {
				
				String value = hm.get(x);
				System.out.println(value + " " +x);
				
			} */
			
			Set value=hm.entrySet();
			
			Iterator it=value.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		
			
		}
		
		public void TreeMapMethod() {
			// does not allows duplicate and null keys but allows multiple null and duplicate values
			//it will print the output in ascending order
			
			TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
			tm.put(101, "Red");
			tm.put(102, "Black");
			tm.put(103, "Blue");
			tm.put(104, "Lavondor");
			tm.put(105, "White");
			tm.put(106, "Black");
			tm.put(107, null);
			tm.put(101, "Orange");
			tm.put(108, "White");
			tm.put(101, null);
			
			for(Map.Entry<Integer, String> x:tm.entrySet()) {
				System.out.println(x.getKey()+ "=" +x.getValue());
			}
			
			Logger log=Logger.getLogger("CollectionConcepts");
			PropertyConfigurator.configure("log4j.properties");
			log.info("Build success");
			
		}
	
		
		/*
		Collection - Framework an Interface. dynamic data structure. provide interfaces and classes

		Interfaces
		1. List - 
		2. Set 
		3. Map


		List
		-----
		1. ArrayList - It will allows duplicate values, it follows resizable architecture
		2. LinkedList - It will allows duplicate values, It follows doubly linked list architecture

		Set
		----
		1. Hashset - It will not allows duplicate values, it follows random order ouput
		2.LinkedHashset - It will not allows duplicate values, it follows insertion order output
		3.Treeset - It will not allows duplicate values, by default it follows ascending order output

		Map
		----
		1. HashMap - It will allow only one null key, but multiple null values. It will allows null keys and values
		2.LinkedHashMap - 
		3.TreeMap


		*/

}
