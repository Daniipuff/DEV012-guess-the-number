package com.mx.laboratoria.dev012;

import java.util.ArrayList;
import java.util.List;

public abstract class PlayerAbstract {

	public PlayerAbstract(String name) {
		this.setGuesses(new ArrayList<Integer>());
		this.name = name;
	}

	private String name;
	private List<Integer> guesses;


	public abstract int makeGuess();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getGuesses() {
		return guesses;
	}

	public void setGuesses(List<Integer> guesses) {
		this.guesses = guesses;
	}

}