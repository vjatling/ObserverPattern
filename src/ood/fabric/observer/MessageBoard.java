package ood.fabric.observer;

import java.util.List;
import java.util.ArrayList;


public class MessageBoard implements TextileBoard{
	
	private List<Observer> observers;
	private String message;
	private boolean changed;
	
	
	public MessageBoard() {
		this.observers= new ArrayList<Observer>();
	}

	@Override
	public void register(Observer obj) {
		if(obj==null) {
			throw new NullPointerException("Null observer registration");
		}
		if(!observers.contains(obj)) {
			observers.add(obj);	
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void unRegister(Observer observer) {
		observers.remove(observers);
		
	}

	@Override
	public void notifyObserver() {
		if(!changed) {
			return;
		}
		else {
			this.changed=false;
			for (Observer observer: this.observers) {
				observer.update();
			}
		}
		
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message; 
	}
	
	public void postMessage(String msg) {
		System.out.println("Message posted: "+msg);
		this.message=msg;
		this.changed=true;
		notifyObserver();
	}

}
