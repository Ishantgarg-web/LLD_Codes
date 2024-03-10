package com.example.templateDesignPattern;

/**
 * 
 * @author ishant
 * In this,
 * we define several tasks and there is a defined pattern to complete these tasks.
 */


public class Main {
	public static void main(String[] args) {
		MasterSystemDesignTemplate strategy1 = new InterviewBitStrategy();
		strategy1.masterSystemDesign();
	}
}
