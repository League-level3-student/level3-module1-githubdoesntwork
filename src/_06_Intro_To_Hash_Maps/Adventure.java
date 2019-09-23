package _06_Intro_To_Hash_Maps;

import java.util.Random;
import java.util.Scanner;

public class Adventure{
	int hp, mxhp, dmg, xp=0, xp2earn, strength=2, rand, enemyhp, enemydmg;
	boolean haveKey=false;
	Random r;
	String answer;
	Scanner s = new Scanner(System.in);
	public Adventure() {
		Start();
	}
	public static void main(String[] args) {
		Adventure game = new Adventure();
	}
	public void Start() {
		r = new Random();
		while(true) {
			System.out.println("You are standing at the gates");
			System.out.println("Of a grand city full of ADVENTURE!");
			System.out.println("-------------------------------------");
			System.out.println("1. Try to enter");
			System.out.println("2. Go South");
			System.out.println("-------------------------------------");
			answer = s.next();
			if(answer.equals("1")) {
				if(haveKey) {
					
				}else {
					System.out.println("The gates are locked. Find a key.");
					System.out.println("-------------------------------------");
					answer = s.next();
				}
			}else if(answer.equals("2")) {
				rand = r.nextInt(3); 
				if(rand == 0) {
					enemyhp=5;
					enemydmg=1;
					xp2earn=10;
					System.out.println("You went South. You see a slime.");
					System.out.println("The slime fearsomely wobbles.");
					System.out.println("-------------------------------------");
				}else if(rand == 1) {
					enemyhp=42069;
					enemydmg=999;
					System.out.println("You went South. You see a werewolf.");
				}else if(rand == 2) {
					
				}
				while(true) {
					System.out.println("1. Run away");
					System.out.println("Other. Stay and fight!");
					System.out.println("-------------------------------------");
					answer = s.next();
					if(answer.equals("1")) {
						System.out.println("You ran away! Coward...");
						System.out.println("-------------------------------------");
						break;
					}else {
						enemyhp-=strength;
						System.out.println("You attacked with a strength of "+strength+"! The enemy now has "+enemyhp+" health.");
						System.out.println("-------------------------------------");
						if(enemyhp<=0) {
							System.out.println("You won! You earned "+xp2earn);
							System.out.println("-------------------------------------");
						}
					}
				}
				
				
			}
		}
	}
}
