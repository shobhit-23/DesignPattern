package Main;
import Observable.IphoneObservableImpl;
import Observable.StocksObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class Store {

	public static void main(String[] args) {
		
		StocksObservable iphoneStocksObservable = new IphoneObservableImpl();
		
		NotificationAlertObserver observer1=new EmailAlertObserverImpl("abc@gmail.com", iphoneStocksObservable);
		NotificationAlertObserver observer2=new MobileAlertObserverImpl("12344",iphoneStocksObservable);
		
		iphoneStocksObservable.add(observer1);
		iphoneStocksObservable.add(observer2);
		
		iphoneStocksObservable.setStockCount(10);

	}

}
