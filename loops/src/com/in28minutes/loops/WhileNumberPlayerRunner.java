package com.in28minutes.loops;

import java.util.Scanner;

public class WhileNumberPlayerRunner {
	public static void main(String[] args) {
		WhileNumberPlayer player = new WhileNumberPlayer();
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter a number to be print its SQUARE/CUBE upto number:");
		  int num=scanner.nextInt();
		
		  //System.out.println(player.printSquaresUptoLimit());
		player.printSquaresUptoLimit(num);
		player.printCubeUptoLimit(num);
	}
}
