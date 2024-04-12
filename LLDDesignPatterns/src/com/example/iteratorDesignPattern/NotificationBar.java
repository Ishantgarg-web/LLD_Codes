package com.example.iteratorDesignPattern;

public class NotificationBar {
	NotificationCollection notifications;
	
	public NotificationBar(NotificationCollection notifications) {
		this.notifications = notifications;
	}
	
	public void printNotifications() {
		Iterator iterator = notifications.createIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
