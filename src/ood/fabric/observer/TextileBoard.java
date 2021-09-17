package ood.fabric.observer;

public interface TextileBoard {
	public void register(Observer obj);
	public void unRegister(Observer observer);
	public void notifyObserver();
	public Object getUpdate(Observer obj);
	
}
