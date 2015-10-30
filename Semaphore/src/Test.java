
public class Test {

	public static void main(String[] args) {
		int numOfCriticalSec=3;
		Semaphore mutex=new Semaphore(numOfCriticalSec);//mutex will allow 3 thread to access critical section

		for (int i = 1; i <=10; i++) {			
			new MutexThread(mutex, "Thread no "+i);//sending thread name and the semaphore to control thread
		}

	}

}
