package ood.fabric.observer;

public class ObserverPattern {

	public static void main(String[] args) {
		MessageBoard mb= new MessageBoard();
		
		Observer observer1=new ObserverImpl ("observer1");
		Observer observer2=new ObserverImpl ("observer2");		
		Observer observer3=new ObserverImpl ("observer3");
	
		mb.register (observer1);
		mb.register (observer2);
		mb.register (observer3);

		observer1.subscribe(mb);
		observer2.subscribe(mb);
		observer3.subscribe(mb);

		observer1.update();

		mb.postMessage("Textile department has released new kind of 'Polyester' fabric today");
		mb.unRegister(observer2);
		mb.postMessage("Also a new pattern of the textile which can be useful to create durable fabric");

	}

}
