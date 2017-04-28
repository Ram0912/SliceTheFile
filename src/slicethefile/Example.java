package slicethefile;

public class Example implements Runnable {
private String name;

	public Example(String name) {
	this.name = name;
}

	@Override
	public void run() {
		System.out.println("Start thread:"+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ended thread:"+name);
		
	}


}
