/**
 * 
 */
package org.dimigo.thread;

/**
 * org.dimigo.thread >> Race
 *
 * @author joona0825
 */
public class Race2 {
	
	public static void main(String[] args) {
		Thread runner1 = new Thread(new Runner2("홍길동"));
		Thread runner2 = new Thread(new Runner2("홍길순"));
		
		System.out.println("main thread start");
		runner1.start();
		runner2.start();
		System.out.println("main thread end");
	}

}
