package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
	
	String userName;
	StocksObservable observable;
	
	public MobileAlertObserverImpl(String userName,StocksObservable observable)
	{
		this.userName=userName;
		this.observable=observable;
	}
	@Override
	public void update() {
		sendMessageOnMobile(userName, "Product is back in stock Hurry Up!!");
	}
	private void sendMessageOnMobile(String userName,String message) {
		System.out.println("Msg sent on Mobile" + userName);
		System.out.println(message);
	}

}
