package ood.fabric.observer;

public class ObserverImpl implements Observer {
	
	private String name;
	private TextileBoard textileboard;
	
	public ObserverImpl(String name) {
		this.name=name;
	}

	@Override
	public void update() {
		String msg = (String) textileboard.getUpdate(this);
		if(msg==null) {
			System.out.println(name+" :No new message");
		}
		else {
			System.out.println(name+" :Consuming message-> "+msg);
		}
					
	}

	@Override
	public void subscribe(TextileBoard textileboard) {
		this.textileboard=textileboard;
		
	}

}
 