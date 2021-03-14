package com.arrayPractice;

import java.util.regex.Pattern;

import org.junit.Test;

public class StringCoding {

	//reverse by character for each word
	public void test1() {
		String s="how are you";//--woh era uoy
		StringBuffer sb=new StringBuffer();
		String []words=s.split(" ");
		for(String word:words) {
			for(int i=word.length()-1;i>=0;i--) {
				sb.append(word.charAt(i));
			}
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
	}
	public void findDuplicateCharacter() {
		String sent="united state of america";
		char[] arrs=sent.toCharArray();
		for(int i=0;i<arrs.length;i++) {
			for(int j=i+1;j<arrs.length;j++) {
				if(arrs[i]==arrs[j]) {
					System.out.println(arrs[i]+"duplicate character");
				}
			}
		}
	}
	
	public void findHighestOccuredCharacter() {
		String sent="united state of america";
		int localCount=1;
		int maxCount=1;
		char[] arrs=sent.toCharArray();
		for(int i=0;i<arrs.length;i++) {
			for(int j=i+1;j<arrs.length;j++) {
				if(arrs[i]==arrs[j]) {
					localCount++;
					//System.out.println(arrs[i]+"duplicate character");
				}
			}
			if(localCount>maxCount) {
				maxCount=localCount;
			}
			localCount=1;
		}
		System.out.println(maxCount);
	}
	
	@Test
	public void ispolindrom() {
		String s="MOM";
		boolean flag=false;
		int j=s.length()-1;
		
		if(s.length()<2||s.equals(null)||s.matches("^[0-9]*$") ){
			System.out.println("is not valid entry");
		}else {
		
		for(int i=0;i<s.length();i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				System.out.println("is not polindrom");
				flag=true;
				break;
			}
			
			
		}
		
		if(flag==false) {
			System.out.println("polindrom");
		}
		}
		
	}
	
	public void swapTwoNumbe() {
		int a=6;int b=13;
		b=b-a;
		a=a+b;
		b=a-b;
	}
	
	@Test
	public void isPrimeNumber() {
		int num=70;
		boolean flag=false;
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				System.out.println("not prime num");
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("prime");
		}
	}
	
	@Test
	public void fabonacciNumber() {
		int f=0;
		int s=1;
		int th=1;
		for(int i=0;i<10;i++) {
			th=f+s;
			System.out.println(th);
			f=s;
			s=th;
			
		}
		
	}
	
	public void factorialValue() {
		//5*4*3*2*1=120
	}
	
	
	
	
	
}
