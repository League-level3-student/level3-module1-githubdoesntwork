package _06_Intro_To_Hash_Maps;

import java.util.Date;
import java.util.Scanner;

public class BlogEntry {
	String user, text;
	MyDate date;

	public BlogEntry(String a, String b, MyDate c) {
		user = a;
		text = b;
		date = c;
	}

	public String DisplayEntry() {
		System.out.println("User: " + user);
		System.out.println("Text: " + text);
		System.out.println("Date: " + date.date());
		return "User: " + user + " Text: " + text + " Date: " + date.date();
	}

	public String getSummary() {
		if (text.length() <= 10) {
			return text;
		} else {
			String summary = "";
			for (int i = 0; i < 10; i++) {
				summary = summary + text.charAt(i);
			}
			return summary;
		}
	}
	public String getSummaryWord() {
		int wordCount=1;
		int save=0;
		for (int i = 1; i < text.length()-1; i++) {
			if(text.charAt(i-1)!=' '&&text.charAt(i)==' '&&text.charAt(i+1)!=' ') {
				wordCount++;
				if(wordCount==11) {
					save=i;
				}
			}
		}
		if(wordCount<=10) {
			return text;
		}else {
			String s="";
			for (int i = 0; i < save; i++) {
				s=s+text.charAt(i);
			}
			return s;
		}
	}

	public static void main(String[] args) {
		MyDate d = new MyDate("October", 3, 2019);
		BlogEntry entry = new BlogEntry("Christopher Lee", "Hi, this is more than 10 characters.", d);
		entry.DisplayEntry();
		System.out.println(entry.getSummary());
		BlogEntry entry2 = new BlogEntry("Christopher Lee", "one two three four five six seven eight nine ten eleven", d);
		System.out.println(entry2.getSummaryWord());
		BlogEntry entry3 = new BlogEntry("Christopher Lee", "one two three four five", d);
		System.out.println(entry3.getSummaryWord());
	}
}
