package com.ISCYear2;

class Date implements java.lang.Comparable<Date>
{
	int month;
	int day;
	int year;
	
	Date(int m, int d, int y)
	{
		month=m;
		day=d;
		year=y;
	}
	
	public int compareTo(Date date)
	{
		if(year==date.year&&day==date.day&&month==date.month)
		return 0;
		else if(year>date.year||month>date.month||day>date.day) return 1;
		else return -1;
	}
	
}
