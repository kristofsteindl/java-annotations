package com.ksteindl.compiletime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ksteindl.principleschecker.annotation.ProgrammedToInterface;

@ProgrammedToInterface
public class DecentDto {
	
	public final String name;
	private int number;
	boolean valid;
	private List<String> aliases = new ArrayList<>();
	private Comparable myCompareble; 
	
	private static final String DEFAULT_NAME = "foo";
	
	public DecentDto(String name) {
		super();
		this.name = name;
	}
	
	public DecentDto(String name, int number, boolean valid) {
		this(name);
		this.number = number;
		this.valid = valid;
	}
	
	private DecentDto() {
		this(DEFAULT_NAME);
	}
	
	public static String getDefaultName() {
		return DEFAULT_NAME;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public List<String> getAliases() {
		return aliases;
	}

	public void setAliases(List<String> aliases) {
		this.aliases = aliases;
	}

	public String getName() {
		return name;
	}

	
	
	
	
	
	
	
	



	
	
	
	
	
	
	  
	  

}
