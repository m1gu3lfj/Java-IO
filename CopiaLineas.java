package mipaquete;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class CopiaLineas {

	public static void main(String[] args) throws IOException {
	    BufferedReader is = null;
            PrintWriter os = null;

        try {
            is = new BufferedReader(new FileReader("fichero_ent.txt"));
            os = new PrintWriter(new FileWriter("fichero_sal.txt"));

            String linea;
            while ((linea = is.readLine()) != null) {
                os.println(linea);
            }
        } finally {
            if (is != null) {
                is.close();
            }
            if (os != null) {
                os.close();
            }
        }
    }
}
