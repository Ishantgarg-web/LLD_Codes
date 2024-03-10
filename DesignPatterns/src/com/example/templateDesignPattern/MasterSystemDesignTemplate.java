package com.example.templateDesignPattern;

public abstract class MasterSystemDesignTemplate {
	
	protected abstract void learnProgrammingLanguage();
	
	protected abstract void learnObjectOriented();
	
	protected abstract void buyBook();
	
	protected abstract void platformForPracticeProblems();
	
	public final void masterSystemDesign() {
		this.learnProgrammingLanguage();
		this.learnObjectOriented();
		this.buyBook();
		this.platformForPracticeProblems();
	}
}
