
public class Semaphore {
	
	private int howManyThread;//we put the number here how many person or thread we want to do a work simultaneously.
	
	public Semaphore(int init){
		if(init<0){
			init=0;
		}
		this.howManyThread=init;//initialize number of thread

	}
	
	public synchronized void down(){
		
		while(howManyThread==0){//now no one can work it must wait.
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 
		}
		howManyThread--;
			
	}
	
	public synchronized void up(){	
		howManyThread++;
		notify();
		
	}

}
