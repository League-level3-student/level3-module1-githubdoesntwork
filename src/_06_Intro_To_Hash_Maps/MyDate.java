package _06_Intro_To_Hash_Maps;

public class MyDate{
	String month;
	int day, year;
public MyDate(String month, int day, int year) {
	this.month=month;
	this.day=day;
	this.year=year;
}
public String date() {
	return month+" "+day+", "+year;
}
}
