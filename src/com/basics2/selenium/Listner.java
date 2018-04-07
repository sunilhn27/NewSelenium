package com.basics2.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class Listner extends AbstractWebDriverEventListener {

	public void afterClickon(WebElement element, WebDriver driver) {
		System.out.println("Clicked");
		Mouse m =new Mouse() {
			
			@Override
			public void mouseUp(Coordinates arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseMove(Coordinates arg0, long arg1, long arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseMove(Coordinates arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDown(Coordinates arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void doubleClick(Coordinates arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void contextClick(Coordinates arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void click(Coordinates arg0) {
				// TODO Auto-generated method stub
				
			}
		};
	}
		
}
