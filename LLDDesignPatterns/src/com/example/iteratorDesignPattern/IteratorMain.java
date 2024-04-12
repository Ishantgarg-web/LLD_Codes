package com.example.iteratorDesignPattern;

/**
 * 
 * @author ishant
 * similiar to Iterable interface present in java used for iterating collections irrespective of the
 * collection datatype.
 */

public class IteratorMain {
	public static void main(String[] args) {
		NotificationCollection nc = new NotificationCollection();
		NotificationBar nb = new NotificationBar(nc);
		nb.printNotifications();
	}
}
