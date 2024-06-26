package com.HusainR.Learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.HusainR.Learnspringframework.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {
		
		try( var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
			context.getBean(GammingConsole.class).up();
//			context.getBean(GameRunner.class).run();
			
		}
	}
}