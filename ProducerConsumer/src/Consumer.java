
public class Consumer extends Thread {
	Element e;
	public Consumer(Element e) {
		this.e = e;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			e.get();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
}
