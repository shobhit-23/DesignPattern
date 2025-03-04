package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


public class threading1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService=Executors.newFixedThreadPool(10);
		final AtomicInteger totalSum = new AtomicInteger(0);
		
		for(int i=1;i<=10;i++)
		{
			executorService.submit(() -> {
				int sum=0;
				for(int j=1;j<=100;j++)
				{
					int val=100+(int)(Math.random()*1000);
					sum+=val;
				}
				System.out.println(Thread.currentThread().getName()+" "+sum);
				totalSum.addAndGet(sum);
			});
		}
		System.out.println(totalSum);
	}
}
