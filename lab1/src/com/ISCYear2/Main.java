package com.ISCYear2;
import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		int sum=0;
		List<Integer> integers=new ArrayList<Integer>();												//problem1
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		
		for(int a: integers)
			sum+=a;
		System.out.println(sum);
		
		ArrayList<Date> date=new ArrayList<Date>();														//problem2
		date.add(new Date(12,3,2001));
		date.add(new Date(12,5,2001));
		date.add(new Date(12,7,2010));
		date.add(new Date(8,3,1920));
		date.add(new Date(12,3,2001));
		
		Collections.sort(date);
		for(Date dt:date)
			System.out.println(dt.month+"-"+dt.day+"-"+dt.year);
		
		SortedMap<Date,String> syllabus=new TreeMap<Date,String>();										//problem3
		syllabus.put(new Date(8,4,2002),"s");
		syllabus.put(new Date(7,23,2001),"h");
		syllabus.put(new Date(2,10,1998),"e");
		syllabus.put(new Date(8,8,2002),"b");
		syllabus.put(new Date(8,12,2002),"e");
		syllabus.put(new Date(5,6,2002),"l");
		syllabus.put(new Date(10,3,2002),"i");
		syllabus.put(new Date(2,30,2003),"e");
		syllabus.put(new Date(8,10,2002),"v");
		syllabus.put(new Date(8,25,2002),"e");
		syllabus.put(new Date(8,2,2010),"d");
		for(Map.Entry<Date, String> x: syllabus.entrySet())
			if(x.getKey().month==8&&x.getKey().year==2002) System.out.print(x.getValue()+" ");
		System.out.println();
										
		tableOfSquares(5);																				//problem4 check
		
	}
																			
	static void tableOfSquares(int n) 																	//problem4
	{
			System.out.println(n+"    "+(n*n));
			if(n!=1)
			tableOfSquares(n+1);	
	}
	
}

