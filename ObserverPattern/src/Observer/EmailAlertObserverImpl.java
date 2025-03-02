package Observer;

import Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

	StocksObservable observable;
	String emailId;
	
	public EmailAlertObserverImpl(String emailId,StocksObservable observable) {
		this.observable=observable;
		this.emailId=emailId;
	}
	@Override
	public void update() {
		sendMail(emailId, "Product is in stock. Hurry Up!!!");
		
	}
	private void sendMail(String emailId,String msg)
	{
		System.out.println("Mail sent to:" + emailId);
		System.out.println(msg);
	}
}
