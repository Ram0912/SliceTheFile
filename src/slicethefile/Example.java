package slicethefile;

public class Example implements Runnable {
private String name;

	public Example(String name) {
	this.name = name;
}

	@Override
	public void run() {
		System.out.println("Start thread:"+name);
	
		System.out.println("ended thread:"+name);
		
	}


}
