package com.example.iteratorDesignPattern;

public class NotificationCollection implements Collection{
	
	private Notification[] notifications;
	
	public NotificationCollection() {
		notifications = new Notification[6];
		notifications[0] = new Notification("notification 1");
		notifications[1] = new Notification("notification 2");
		notifications[2] = new Notification("notification 3");
	}
	
	@Override
	public Iterator createIterator() {
		return new NotificationIterator(notifications);
	}
	
}
