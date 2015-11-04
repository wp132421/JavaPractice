/**
 * 
 */
package org.dimigo.thread;

/**
 * org.dimigo.thread >> Runner
 *
 * @author joona0825
 */
public class Runner extends Thread {
	
	protected String name;
	
	public Runner() {}
	public Runner(String name) {this.name=name;}
	
	@Override
	public void run() {
		try {
			System.out.println(name + " 출발");
			for(int i=0; i<=10; i++) {
				System.out.println(name + " " + ((10 - i) * 10) + "미터");
				Thread.sleep(1000);
			}
			System.out.println(name + " 골인");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
