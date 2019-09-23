package _06_Intro_To_Hash_Maps;
import java.util.Scanner;

import java.util.Scanner;

public class convert_money
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in); 
		System.out.println("Currency to convert to US dollars: e = Euros, c = Chinese Yuan, r = Indian Rupees, b = Bitcoin: ");
		String country = input.next();
		System.out.println("Amount of Euros/Yuan/Rupees/Bitcoin to convert: ");
		int amount = input.nextInt();
		switch(country) {
		case "e":
			System.out.println("In US dollars, that is $"+(amount*1.16));
			break;
		case "c":
			System.out.println("In US dollars, that is $"+(amount*0.15));
			break;
		case "r":
			System.out.println("In US dollars, that is $"+(amount*0.015));
			break;
		case "b":
			System.out.println("In US dollars, that is $"+(amount*6923.80));
			break;
		}
	}
}
		

		
