package controller;

public class ThreadVisualizar extends Thread {
	int i;
	public ThreadVisualizar(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		contarThreads();
	}
	
	public void contarThreads() {
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("TID => "+Thread.currentThread().getId());
	}
}
