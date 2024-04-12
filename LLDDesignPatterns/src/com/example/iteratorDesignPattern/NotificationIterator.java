package com.example.iteratorDesignPattern;

public class NotificationIterator implements Iterator{
	
	Notification[] notifications;
	int pos;
	
	public NotificationIterator(Notification[] notifications) {
		this.notifications = notifications;
		this.pos = -1;
	}

	@Override
	public boolean hasNext() {
		if(pos < notifications.length-1) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		if(hasNext()) {
			pos++;
			return (notifications[pos]!=null)?notifications[pos].getNotification():"null";
		}else {
			return null;
		}
	}

}
