package com.arrayPractice;

public class Student {
	
	Student st[]=new Student[30];
	String name;int id;
	Student(String name,int id) {
		this.name=name;
		this.id=id;
	}
	void printInfo() {
		System.out.println(name);
		System.out.println(id);
	}
	int[] test3(int [] a) {
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		return b;
	}

}
