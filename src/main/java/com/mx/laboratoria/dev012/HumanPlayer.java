package com.mx.laboratoria.dev012;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HumanPlayer extends PlayerAbstract {

	public HumanPlayer(String name) {//Esto es un constructor
		super(name);
	}

	@Override
	public int makeGuess() {
		Scanner scanNumber = new Scanner(System.in);
		System.out.println("--- Round: Player 1 ---");
		System.out.println("Jugador(a) " + this.getName() + " ingresa un numero: ");
		int numberInsert = Integer.parseInt(scanNumber.next());
		List<Integer> numbers = new ArrayList<Integer>();
		numbers = this.getGuesses();
		numbers.add(numberInsert);
		this.setGuesses(numbers);
//		scanNumber.close();
		return numberInsert;
		
	}

}