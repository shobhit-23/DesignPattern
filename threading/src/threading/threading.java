package threading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


public class threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService=Executors.newFixedThreadPool(10);
		final AtomicInteger totalSum = new AtomicInteger(0);
		
		System.out.println("available cores:" + Runtime.getRuntime().availableProcessors());
		
		long t1=System.currentTimeMillis();
		
		for(int i=1;i<=100;i++)
		{
			executorService.submit(() -> {
				int sum=0;
				for(int j=1;j<=1000;j++)
				{
					int val=100+(int)(Math.random()*1000);
					sum+=val;
				}
				System.out.println(Thread.currentThread().getName()+" "+sum);
				totalSum.addAndGet(sum);
			});
		}
		
		executorService.shutdown();
		while(!executorService.isTerminated())
		{
			
		}
		
		long t2=System.currentTimeMillis();
		System.out.println(totalSum);
		System.out.print("Time Taken:"+ (t2-t1));
	}

}
