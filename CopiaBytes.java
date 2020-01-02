package mipaquete;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaBytes {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("fichero_ent.txt");
			fos = new FileOutputStream("fichero_sal.txt");
			int byte1;
			while ((byte1 = fis.read()) != -1) {
				fos.write(byte1);
			}
		} 
		finally {
			if (fis != null) {
				fis.close();
			}
			if (fos != null) {
				fos.close();
			}
		}
	}
}
