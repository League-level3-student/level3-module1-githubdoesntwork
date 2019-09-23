package _06_Intro_To_Hash_Maps;

import java.util.Scanner;

public class APCOMPUTERSCIENCE {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Square root below:");
		double x = s.nextDouble();
		Sqrt(x);
		while(true) {
		System.out.println("Insert green crud population and time in days below:");
		int og = s.nextInt();
		s.nextLine();
		int days = s.nextInt();
		Fibonacci(og, days);
		System.out.println("Do you want to repeat?(y/n)");
		String c = s.nextLine();
		if(c.equals("n")) {
		break;	
		}
		}
		s.close();
	}
	public static double E(int x) {
		double v1=0, v2=0, v3=0, v4=0;
		for (int i = 0; i < 1; i++) {
			v1+=(x^i)/i;
		}
		System.out.println("n=1:"+v1);
		for (int i = 0; i < 10; i++) {
			v2+=(x^i)/i;
		}
		System.out.println("n=10:"+v2);
		for (int i = 0; i < 50; i++) {
			v3+=(x^i)/i;
		}
		System.out.println("n=50:"+v3);
		for (int i = 0; i < 100; i++) {
			v4+=(x^i)/i;
		}
		System.out.println("n=100:"+v4);
		return v1, v2, v3, v4;
	}

	public static int Fibonacci(int og, int days) {
		int pop1=0, pop2=og; 
		System.out.println("Initial green crud population: " +og);
		System.out.println("Passing "+days+" days...");
		int newDays=(int)days/5;
		for (int i = 0; i < newDays; i++) {
			pop2+=pop1;
			pop1=pop2;
		}
		System.out.println("Green crud population grew from "+og+" pounds to "+pop2+" pounds over a time of "+days+" days.");
		return pop2;
	}

	public static double Sqrt(double n) {
		boolean one = false;
		double lastGuess;
		double guess = n / 2;
		while (!one) {
			lastGuess = guess;
			double r = n / guess;
			guess = (guess + r) / 2;
			if (guess >= lastGuess && (1.01 * lastGuess) > guess) {
				one = true;
			}
		}
		guess *= 100;
		guess = Math.round(guess);
		guess /= 100;
		System.out.println(guess);
		return guess;
	}
	public String Thing(float temp) {
		String state;
		if(temp<=32) {
			state = "solid";
		}else if(temp>=212) {
			state = "gas";
		}else {
				state = "liquid";
		}
		return "Water at a temperature of "+(temp-32)*5/9+" is "+state+".";
	}
}