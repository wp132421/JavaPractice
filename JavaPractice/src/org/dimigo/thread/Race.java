/**
 * 
 */
package org.dimigo.thread;

/**
 * org.dimigo.thread >> Race
 *
 * @author joona0825
 */
public class Race {
	
	public static void main(String[] args) {
		Thread runner1 = new Runner("홍길동");
		Thread runner2 = new Runner("홍길순");
		
		System.out.println("main thread start");
		runner1.start();
		runner2.start();
		System.out.println("main thread end");
	}

}
