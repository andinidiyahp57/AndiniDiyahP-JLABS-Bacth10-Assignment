package com.javaprogram;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapTreeSetDemo {
	public static void main (String[] args) {
		//The map is sorted according to the natural ordering of its keys
		//Integer as key in this treeMap
		
		System.out.println("--Using TreeMap--\n");
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(20, "Andini");
		treeMap.put(16, "Melod");
		treeMap.put(16, "Diyah");
		treeMap.put(24, "Pramesti");
		treeMap.put(10, "Lodi");
		treeMap.put(23, "Buti");
		
		for(Integer key : treeMap.keySet()) {
			System.out.println(treeMap.get(key) + "'s age is " + key + " Years");
		}
		
		System.out.println("\n--Using TreeSet--\n");
		
		//in TreeSet, only shows unique data sequentially
		TreeSet<Integer> idNumber = new TreeSet<>();
		idNumber.add(202);
		idNumber.add(204);
		idNumber.add(203);
		idNumber.add(206);
		idNumber.add(202);
		
		for(Integer item : idNumber) {
			System.out.println(item);
		}
		
		
	}

}
