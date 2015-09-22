/**
 * 
 */
package org.dimigo.exception;

/**
 * org.dimigo.exception >> Movie
 *
 * @author joona0825
 */
public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLimitAge() {
		return limitAge;
	}

}
