package com.example.templateDesignPattern;

public class GFGStrategy extends MasterSystemDesignTemplate{

	@Override
	protected void learnProgrammingLanguage() {
		System.out.println("Learn Java");
	}

	@Override
	protected void learnObjectOriented() {
		System.out.println("Read about on geeksforgeeks");
	}

	@Override
	protected void buyBook() {
		System.out.println("Read Book Gang of 4");
	}

	@Override
	protected void platformForPracticeProblems() {
		System.out.println("Go through GeeksForGeeks");
	}
	
}
