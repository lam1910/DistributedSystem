package synchronization;

public class MainWithoutSync {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ResourcesExploiter resource = new ResourcesExploiter(0);
		ThreadedWorkerWithoutSync worker1= new ThreadedWorkerWithoutSync(resource);
		ThreadedWorkerWithoutSync worker2= new ThreadedWorkerWithoutSync(resource);
		ThreadedWorkerWithoutSync worker3= new ThreadedWorkerWithoutSync(resource);
		
		worker1.start();
		worker2.start();
		worker3.start();
		worker1.join();
		worker2.join();
		worker3.join();
		
		System.out.println(resource.getRsc());
	}

}
