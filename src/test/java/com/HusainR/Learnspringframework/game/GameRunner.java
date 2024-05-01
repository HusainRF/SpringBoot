package com.HusainR.Learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier; 	
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	private GammingConsole game;
	
	public GameRunner(@Qualifier("SuperContraGameQualifier") GammingConsole game) {
		this.game = game;
	}

	public void run() {
		
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}