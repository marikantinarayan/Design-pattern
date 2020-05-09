package com.nari.Observer;

public interface Subject {

	void subscribe(subscriber sub);

	void unsubscribe(Observer sub);

	void notifysubscribes();

	void upload(String title);

}