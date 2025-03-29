package network;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class Download {

	public static void main(String[] args) throws Exception {
		URI uri = new URI("https://www.srikanthtechnologies.com/banner.jpg");
		URL urlobj = URL.of(uri, null);
		InputStream is = urlobj.openStream();
		FileOutputStream fo = new FileOutputStream("c:\\classroom\\java\\st.jpg");
		int ch = is.read();
		while (ch != -1) {
			fo.write(ch);
			ch = is.read();
		}
		fo.close();
		is.close();
		System.out.println("Download completed!");
	}

}
