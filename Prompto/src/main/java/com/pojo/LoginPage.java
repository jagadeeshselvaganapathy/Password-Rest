package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;


public class LoginPage extends BaseClass {
	
	public LoginPage() {
    PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement txtusername;
	
	@FindBy(id = "password")
	private WebElement txtpassword;
	
	@FindBy(id = "button_signInButton")
	private WebElement signInButton;
	
	
	
		

	public WebElement getTxtusername() {
		return txtusername;
	}


	public WebElement getTxtPassword() {
		return txtpassword;
	}

	
	public WebElement getSignInButton() {
		return signInButton;
	}


	public void login(String username, String password) throws InterruptedException, IOException, AWTException {
		
Thread.sleep(5000);



		insertText(getTxtusername(), username);
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyRelease(KeyEvent.VK_MINUS);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyRelease(KeyEvent.VK_MINUS);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyRelease(KeyEvent.VK_MINUS);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		insertText(getTxtPassword(), password);
		Thread.sleep(2000);
		clickButton(getSignInButton());
		Thread.sleep(10000);
		
		
		
	}

}
