import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.NumberUtils;

public class Date {
	String y;
	String m;
	String d;
	private int year;
	private int month;
	private int date;
	private String tips = "There are not numbers in your words!";
	private String Truee = "It is legal.";
	private String Falsee = "It is illegal.";
	
	public Date() {
		y = "";
		m = "";
		d = "";
		year = 0;
		month = 0;
		date = 0;
	}
	
	public void getchary(String s)	{
		this.y = s;
	}
	
	public void getcharm(String s) {
		this.m = s;
	}
	
	public void getchard(String s) {
		this.d = s;
	}
	
	public int getyear() {
		return this.year;
	}
	
	public int getmonth() {
		return this.month;
	}
	
	public int getdate() {
		return this.date;
	}
	
	public void setyear(int years) {
		this.year = years;
	}
	
	public void setmonth(int months) {
		this.month = months;
	}
	
	public void setdate(int dates) {
		this.date = dates;
	}
	
	public boolean IsLegal(String s) {
		NumberUtils num = new NumberUtils();
		return num.isDigits(s);
	}
	
	public int ConvertCharstoInteger(String s) {
		NumberUtils num = new NumberUtils();		
		return num.stringToInt(s);		
	}
	
	public boolean Convert() {
		if(IsLegal(y)&&IsLegal(m)&&IsLegal(d)) {
		this.year = this.ConvertCharstoInteger(y);
		this.month = this.ConvertCharstoInteger(m);
		this.date = this.ConvertCharstoInteger(d);
		return true;
		}
		else	{
			this.gettips();
			return false;
		}
	}
	
	public boolean IsLeapYear() {
		if(this.year % 4 == 0) {
			if(this.year % 100 == 0) {			
				if(this.year % 400 == 0)
					return true;
				else
					return true;
					//return false;				//The Fault
			}
			else
				return true;				
		}
		else
			return false;
	}
	
	public boolean IsLegalMonth() {
		if(this.month >= 1 && this.month <= 12)
			return true;
		else
			return false;
	}
	
	public boolean IsLegalDate() {
		Integer [] big = new Integer[] {1, 3, 5, 7, 8, 10, 12};
		Integer [] small = new Integer [] {4, 6, 9, 11};
		Integer [] special = new Integer [] {2};   
		List<Integer> list = Arrays.asList(big);
		if(list.contains(this.month)) {
			if(this.date >=0 && this.date <= 31)
				return true;
			else
				return false;
		}
		list = Arrays.asList(small);
		if(list.contains(this.month)) {
			if(this.date >=1 && this.date <= 30)
				return true;
			else
				return false;
		}
		list = Arrays.asList(special);
		if(list.contains(this.month)) {
			if(IsLeapYear()) {
				if(this.date >= 1 && this.date <= 29)
					return true;
				else
					return false;
			}
			else {
				if(this.date >= 1 && this.date <= 28)
					return true;
				else
					return false;
			}
		}
		return false;
	}
	
	public void gettrue() {
		System.out.println(this.Truee);
	}
	
	public void getfalse() {
		System.out.println(this.Falsee);
	}
	
	public void gettips() {
		System.out.println(this.tips);
	}
}
