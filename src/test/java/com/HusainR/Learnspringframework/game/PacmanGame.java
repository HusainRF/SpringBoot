package com.HusainR.Learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GammingConsole{
	
	public void up() {
		System.out.println("up");
	}

	public void down() {
		System.out.println("down");
	}
	
	public void left() {
		System.out.println("left");
	}

	public void right() {
		System.out.println("right");
	}

}