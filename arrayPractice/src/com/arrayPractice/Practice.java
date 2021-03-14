package com.arrayPractice;

import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {
//		Data Structure: 
//		data organization, management, and 
//		storage format that enables efficient access and modification. 
//		More precisely, a data structure is a collection of data values, 
//		the relationships among them, and the functions or operations that 
//		can be applied to the data
		
//		CRUD function 
		
//		-Collection of elements identified by index
//		-dynamic so grows
//		
//		-part of core 
//		-part of framework
//		
//		-assignment operators used to assign
//		-methods are used
//		
//		-Contains Primitives or objects
//		-Only Objects
//		
//		-Fixed size
//		-Dynamic
//		
//		-homogeneous 
//		-heterogeneous
		
		
//		definition: An array is a container object that holds a 
//		fixed number of values of a single type. 
//		length is established at the time of creation
			
//		Two ways of initialization
		int size = 10;
		int []ids = new int[size];
		ids[0] = 142;
		ids[1] = 56;
		ids[2] = 144542;
		ids[3] = 997;
		ids[4] = 6;
		ids[5] = 74;
		ids[6] = 3465;
		ids[7] = 334;
		ids[8] = 978;
		ids[9] = 46;
		
		System.out.println(ids[3]);
		
		int number[] = {11,22,33,44};
		System.out.println(number[3]);
		
		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);
		}
		System.out.println("------");
		for(int i : number) {
			System.out.println(i);
		}
		
//		All methods Arrays class all throw a NullPointerException
		
//		String [] names = {"Name 1", "Name 2", "Name 3"};
		Arrays.sort(ids);
		for(int i : ids) {
			System.out.println(i);
		}
		for(int i : number) {
			System.out.println(i);
		}
		int index = Arrays.binarySearch(ids, 46);
		System.out.println(index);
		
//		How to get Max/Min number?
		int max = ids[0];
		
		for (int i = 1; i < ids.length; i++) {
			if (ids[i] > max) {
				max = ids[i];
			}
		}
		System.out.println("Largest " + max);
		
		int min = ids[0];
		
		for (int i = 1; i < ids.length; i++) {
			if (ids[i] < min) {
				min = ids[i];
			}
		}
		System.out.println("Smallest " + min);
		
		
		
		
		System.out.println("----------------");
		
//		Return and Use parameterized array
		String students[] = getArrayOfStudents();
		setArrayOfStudents(ids);
//		Sum of two largest int
		int largeOne = ids[0], largeTwo=0;
		
		for (int i = 1; i < ids.length; i++) {
			if (ids[i] > largeOne) {
				largeTwo = largeOne;
				largeOne = ids[i];
			}
			else if(ids[i] > largeTwo) {
				largeTwo = ids[i];
			}
			
		}
		System.out.println(largeOne);
		System.out.println(largeTwo);
		System.out.println(largeOne + largeTwo);
		
		
		
//		Multidimensional Array
		
		
//		HomeWork
//		verifyMenu(String[] displayed, String[] expected)
//		How to find duplicate value from an array?
	}

	private static String[] getArrayOfStudents() {
		String [] names = {"Name 1", "Name 2", "Name 3"};
		return names;
	}
	
	private static void setArrayOfStudents(int ages[]) {
		int [] in = ages;
	}
}
