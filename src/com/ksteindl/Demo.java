package com.ksteindl;

import java.util.ArrayList;

import com.ksteindl.annotations.RegexChecker;
import com.ksteindl.compiletime.Folder;
import com.ksteindl.runtime.TestClass;

public class Demo {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		TestClass testClass = new TestClass();
		System.out.println(RegexChecker.check(testClass));
		testClass.setDigits("12234");
		System.out.println(RegexChecker.check(testClass));
		testClass.setDigits("alma");
		System.out.println(RegexChecker.check(testClass));
		
		Folder folder = new Folder(new ArrayList<>());
		folder.add(new Folder(new ArrayList<>()));
		folder.add(new Folder(new ArrayList<>()));
		
	}

}
