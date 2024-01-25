package com.mx.laboratoria.dev012;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.Silent.class)
public class GuessTheNumberGameTest {

	@Spy
	GuessTheNumberGame game = new GuessTheNumberGame();
	
	PlayerAbstract player = mock(HumanPlayer.class);
	
	HumanPlayer human = mock(HumanPlayer.class);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testMainArriba() throws Exception {
		
		Class<?> mockServiceClass = Class.forName("com.mx.laboratoria.dev012.GuessTheNumberGame");
		GuessTheNumberGame mockService = (GuessTheNumberGame) mockServiceClass.getDeclaredConstructor().newInstance();
	    Field field = mockServiceClass.getDeclaredField("randomNumber");
	    field.setAccessible(true);
	    field.set(mockService, 30);
		
		List<Integer> tiros = new ArrayList();
		tiros.add(60);
		when(player.getName()).thenReturn("Dany");
		when(player.getGuesses()).thenReturn(tiros);
		assertTrue(game.checkGuess(player));
		
	}
	
	
	@Test
	public void testMainDebajo() throws Exception {
		
		Class<?> mockServiceClass = Class.forName("com.mx.laboratoria.dev012.GuessTheNumberGame");
		GuessTheNumberGame mockService = (GuessTheNumberGame) mockServiceClass.getDeclaredConstructor().newInstance();
	    Field field = mockServiceClass.getDeclaredField("randomNumber");
	    field.setAccessible(true);
	    field.set(mockService, 30);
		
		List<Integer> tiros = new ArrayList();
		tiros.add(10);
		when(player.getName()).thenReturn("Dany");
		when(player.getGuesses()).thenReturn(tiros);
		assertTrue(game.checkGuess(player));
		
	}
	
	
	@Test
	public void testMainAcertado() throws Exception {
		
		Class<?> mockServiceClass = Class.forName("com.mx.laboratoria.dev012.GuessTheNumberGame");
		GuessTheNumberGame mockService = (GuessTheNumberGame) mockServiceClass.getDeclaredConstructor().newInstance();
	    Field field = mockServiceClass.getDeclaredField("randomNumber");
	    field.setAccessible(true);
	    field.set(mockService, 30);
		
		List<Integer> tiros = new ArrayList();
		tiros.add(30);
		when(player.getName()).thenReturn("Dany");
		when(player.getGuesses()).thenReturn(tiros);
		assertFalse(game.checkGuess(player));
		
	}

}
