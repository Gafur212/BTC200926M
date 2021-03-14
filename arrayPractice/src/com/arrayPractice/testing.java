package com.arrayPractice;

import org.junit.Test;

public class testing {

	@Test
	public void test1() {
		
		Student st=new Student("",67);
		int [] a= {40,6,41,100,5};
	int[]	x=st.test3(a);
	for(int c:x) {
		System.out.println(c);
	}
	
	//max number

	int maxnum=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>maxnum) {
				maxnum=a[i];
			}
		}
		System.out.println(maxnum);
		
		//find the duplicate number
		//find the second highest number
		int s=a[0];
		int sh=a[1];
		if(sh>s) {
			sh=a[0];
			s=a[1];
			
		}
		for(int i=2;i<a.length;i++) {
			if(a[i]>s) {
				sh=s;
				s=a[i];
			}else if(a[i]<s&&a[i]>sh) {
				sh=a[i];
			}
		}
		System.out.println("seconf "+sh);
		
		
		//find the highest occured number
		
		
		
		
//		Student s[]=new Student[2];
//		s[0]=new Shahidul("ds", 223);
//		s[1]=new Asad("dssdf", 24323);
//		for(int i=0;i<s.length;i++) {
//			s[i].printInfo();
//		}
//		
	}
	
	int i;
	int j = 0;
	@Test
	public void test2() {
		System.out.println(addtwonum());
	}
	
	public String addtwonum(){
int a[]= {300,50,450,200};
		
		//find the two index number which return 500
		for( i=0;i<a.length;i++) {
			for( j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==500) {
					return "the sum of index number "+i+"and"+j+" is 500";
				}
				
					
				
			}
		}
		return "not found";
		
	}
	
	
	
	
	
	
}
