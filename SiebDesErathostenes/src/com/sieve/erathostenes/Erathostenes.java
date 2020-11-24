package com.sieve.erathostenes;

public class Erathostenes {
	
	public static void main(String[] args) {
		
		int max = 20;
		int i;
		boolean[] sieben = new boolean[max+1];
		for (i = 2; i <= max; i++) {
			sieben[i] = true;
		}
		i = 2;
		while (i <= max) {
			System.out.println(i + " ist eine Primzahl");
			for (int j = i; j <= max; j += i) {
				sieben[j] = false;
			}
			while (i <= max && !sieben[i]) i++;
		}
	}
}
