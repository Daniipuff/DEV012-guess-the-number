package com.mx.laboratoria.dev012;

import java.util.Scanner;

public class GuessTheNumberGame  {
	static Integer randomNumber = (int) (Math.random() * 100 + 1);//Creamos numero aleatorio, valor global 

	public static void main(String args[]) {
		System.out.println(randomNumber);
		System.out.println("Bienvenido a Guess The Number Game...!!");//Se imprime el saludo
		System.out.println("Ingresa el nombre del Jugador(a):" );//Se imprime el nombre 
		Scanner scannName = new Scanner (System.in);//Se genera objeto para ingresar nombre
		String nameInsert = scannName.next();//Se guarda la variable 
		
		PlayerAbstract humanPlayerObj = new HumanPlayer(nameInsert);//se crea un objeto del hijo 
		
		String nameComputer = "Computer Player";//creamos el nombre de la compu y lo guardamos en numberComputer
		PlayerAbstract computerPlayerObj = new ComputerPlayer(nameComputer);//creamos un objeto para que contenga el nombre
		
		humanPlayerObj.makeGuess();//Llamamos al objeto del numero del humanplayer que ingresa 
		
		boolean turno = false; //Declaramos e inicializamos la bandera 
		boolean endGame = checkGuess(humanPlayerObj);//cremos una variable para entender el ciclo while
		
		while(endGame) {//creamos un ciclo while que van a entrar hasta que adivines el numero 
		if (turno) {
			humanPlayerObj.makeGuess();
			endGame = checkGuess(humanPlayerObj);
			
			turno = false;
		}else {
			computerPlayerObj.makeGuess();
			endGame = checkGuess(computerPlayerObj);
			
			turno = true;
		}
		}
		if(turno) {
			System.out.println("Intentos " + computerPlayerObj.getGuesses());
			System.out.println("Total de intentos " + computerPlayerObj.getGuesses().size());
		}else {
			System.out.println("Intentos " + humanPlayerObj.getGuesses());
			System.out.println("Total de intentos " + "[" + humanPlayerObj.getGuesses().size()+ "]");
		}
		
		scannName.close();
	}
	
	public static boolean checkGuess(PlayerAbstract player){
		int historyList = player.getGuesses().size();
		
		if (randomNumber == player.getGuesses().get(historyList -1)) {
			System.out.println("Felicidades Ganaste...!! ");
			return false;
		}else if (randomNumber > player.getGuesses().get(historyList -1)){
			System.out.println("Estás por debajo del número");
			return true;
			}else {
				System.out.println("Estás por arriba del número");
				return true;
			}
	}
	
}
