package com.ksteindl.compiletime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ksteindl.principleschecker.annotation.ProgrammedToInterface;

@ProgrammedToInterface
public class IndecentDto {
	
	public final String name;
	private int number;
	boolean valid;
	private int[] lotteryNumbers = new int[5];
	private List<String> aliases = new ArrayList<>();
	private Date dateOfCraetion; 
	private Comparable myCompareble; 
	
	private static final String DEFAULT_NAME = "foo";
	
	public IndecentDto(String name) {
		super();
		this.dateOfCraetion = new Date();
		this.name = name;
	}
	
	public IndecentDto(String name, int number, boolean valid) {
		this(name);
		this.number = number;
		this.valid = valid;
	}
	
	private IndecentDto() {
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

	public Date getDateOfCraetion() {
		return dateOfCraetion;
	}

	public void setDateOfCraetion(Date dateOfCraetion) {
		this.dateOfCraetion = dateOfCraetion;
	}

	public String getName() {
		return name;
	}

	public int[] getLotteryNumbers() {
		return lotteryNumbers;
	}

	public void setLotteryNumbers(int[] lotteryNumbers) {
		this.lotteryNumbers = lotteryNumbers;
	}
	
	
	
	
	
	
	
	



	
	
	
	
	
	
	  
	  

}
