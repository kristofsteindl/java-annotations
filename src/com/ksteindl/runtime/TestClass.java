package com.ksteindl.runtime;

import com.ksteindl.annotations.Regex;

public class TestClass {
	

	@Regex("[0-9]+")
	private String digits;

	public String getDigits() {
		return digits;
	}

	public void setDigits(String digits) {
		this.digits = digits;
	}
	
	
	

}
