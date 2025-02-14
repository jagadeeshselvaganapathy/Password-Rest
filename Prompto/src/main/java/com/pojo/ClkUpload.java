package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkUpload extends BaseClass{
	public ClkUpload() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "(//p[contains(text(),'Open project')])[1]")
	private WebElement projectOpen;
	
	@FindBy(xpath = "//span[normalize-space()='Add media']")
	private WebElement addMediaButton;
	
	@FindBy(xpath = "//span[normalize-space()='Upload files']")
	private WebElement uploadFile;
	
	@FindBy(xpath = "//span[normalize-space()='Upload 360 images']")
	private WebElement upload360Image;
	
	
	@FindBy(xpath = "//span[normalize-space()='Add Prompto 360 tour']")
	private WebElement upload360Tour;
	
	@FindBy(xpath = "//input[@id='tour']")
	private WebElement upload360TourCode;
	
	@FindBy(xpath = "//span[normalize-space()='Link 360 tour']")
	private WebElement link360Tour;
	
	
	
	public WebElement getProjectOpen() {
		return projectOpen;
	}


	public WebElement getAddMediaButton() {
		return addMediaButton;
	}


	public WebElement getUploadFile() {
		return uploadFile;
	}


	public WebElement getUpload360Image() {
		return upload360Image;
	}


	public WebElement getUpload360Tour() {
		return upload360Tour;
	}
	
	public WebElement getUpload360TourCode() {
		return upload360TourCode;
	}


	public WebElement getLink360Tour() {
		return link360Tour;
	}

	public void clkUpload() throws AWTException, InterruptedException {
		
	clickButton(getProjectOpen());
	clickButton(getAddMediaButton());
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", getUploadFile());
	Robot rb = new Robot();
	rb.delay(2000);
	StringSelection ss = new StringSelection("C:\\Users\\DCKLP-060\\Desktop\\prompto.png");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.delay(2000);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		
		
		js.executeScript("arguments[0].click()", getUploadFile());
		rb.delay(2000);
		StringSelection ss1 = new StringSelection("C:\\Users\\DCKLP-060\\Desktop");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			
			
		
			js.executeScript("arguments[0].click()", getUpload360Image());
			rb.delay(2000);
			StringSelection ss2 = new StringSelection("C:\\Users\\DCKLP-060\\Desktop\\prompto.png");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
			rb.delay(2000);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.delay(2000);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(5000);
				
				
			js.executeScript("arguments[0].click()", getUpload360Tour());
			insertText(getUpload360TourCode(), "EOE29");
			Thread.sleep(5000);
			clickButton(getLink360Tour());
			Thread.sleep(8000);
		
	}
	
	

}
