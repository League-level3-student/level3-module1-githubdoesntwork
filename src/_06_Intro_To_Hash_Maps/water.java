package _06_Intro_To_Hash_Maps;

import java.util.Scanner;

public class water {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("What temperature is the water?");
double temp = scanner.nextDouble();
String state;
		if(temp<=32) {
			state = "solid";
		}else if(temp>=212) {
			state = "gas";
		}else {
			state = "liquid";
		}
		System.out.println("Water at a temperature of "+(temp-32)*5/9+" is "+state+".");
}
}
