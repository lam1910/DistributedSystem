package synchronization;

public class ThreadedWorkerWithLock extends Thread {
	private ResourcesExploiterWithLock rExp;
	
	public ThreadedWorkerWithLock(ResourcesExploiterWithLock rExp) {
		super();
		this.rExp = rExp;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			rExp.exploit();
		}
	}
}
