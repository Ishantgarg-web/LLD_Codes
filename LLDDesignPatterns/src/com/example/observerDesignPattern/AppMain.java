package com.example.observerDesignPattern;

/**
 * 
 * @author ishant
 * Use Case:
 * in this, Subject can register observer and unregister observer and observer will be notify.
 * 
 * Task:
 * There is a APP, when users install that app then it means subject will register that observer for
 * this APP and when user uninstall the app, then it means subject will unregister that observer.
 */

public class AppMain {
	public static void main(String[] args) {
		
		Observer abc1Observer = new Observer("abc1");
		Observer abc2Observer = new Observer("abc2");
		
		GoogleDrive gd = new GoogleDrive();
		gd.registerObserver(abc1Observer);
		
		MathBuilder mb = new MathBuilder();
		mb.registerObserver(abc1Observer);
		mb.registerObserver(abc2Observer);
		
		mb.changedData("policy changed");
		
		mb.unregisterObserver(abc2Observer);
		
		mb.changedData("new policy applied");
	}
}
