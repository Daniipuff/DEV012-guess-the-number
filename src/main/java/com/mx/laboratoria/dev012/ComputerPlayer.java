package com.mx.laboratoria.dev012;

import java.util.List;


public class ComputerPlayer extends PlayerAbstract {

	public ComputerPlayer(String name) {
		super(name);
	}
	
	

	@Override
	public int makeGuess() {
		System.out.println("--- Round: Computer Player  ---");
		System.out.println("Computadora Ingresa un numero: ");
		int numberRandomC = random();
		List<Integer> numbersCompu = this.getGuesses();
		numbersCompu.add(numberRandomC);
		this.setGuesses(numbersCompu);
		return numberRandomC;
	}
	
	public static int random() {
		final Integer targetNumber = (int) (Math.random() * 100 + 1);
		System.out.println(targetNumber);
		return targetNumber;
	}
	
}