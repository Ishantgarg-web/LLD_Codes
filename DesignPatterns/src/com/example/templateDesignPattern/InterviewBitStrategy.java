package com.example.templateDesignPattern;

public class InterviewBitStrategy extends MasterSystemDesignTemplate{

	@Override
	protected void learnProgrammingLanguage() {
		System.out.println("Learn Python");
	}

	@Override
	protected void learnObjectOriented() {
		System.out.println("Go through InterviewBit");
	}

	@Override
	protected void buyBook() {
		System.out.println("Buy Book Head of first design patterns");
	}

	@Override
	protected void platformForPracticeProblems() {
		System.out.println("Go through leetcode");
	}

}
