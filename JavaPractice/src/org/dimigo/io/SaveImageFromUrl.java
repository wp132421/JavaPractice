/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * org.dimigo.io >> SaveImageFromUrl
 *
 * @author joona0825
 */
public class SaveImageFromUrl {
	
	public static void main(String[] args) {
		String imgURL = "http://assets.rollingstone.com/assets/2015/media/188943/_original/1426595615/1035x626-460335070.jpg";
		
		try {
			URL url = new URL(imgURL);
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/logo.png");
			
			byte[] buf = new byte[1024];
			int res;
			while((res = is.read(buf)) != -1) {
				os.write(buf, 0, res);
			}
			
			System.out.println("Done!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}