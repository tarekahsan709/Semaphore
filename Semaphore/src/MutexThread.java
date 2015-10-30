
public class MutexThread extends Thread {
	private Semaphore mutex;
	int i=0;

	public MutexThread(Semaphore mutex,String name) {
		super(name);
		this.mutex=mutex;
		start();//this start will call the run method. run is below here
	}
	
	@Override
	public void run() {
		while (true) {
			mutex.down();//entering the to the lock
			System.out.println("#Enter the criticle section "+getName());
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Leaving the criticle section"+getName());
			System.out.println("Now one can In*****************");
			mutex.up();//release the lock
		
		}
	}

}
