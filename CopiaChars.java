package mipaquete;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiaChars {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
        	FileWriter fw = null;

        try {
            fr = new FileReader("fichero_ent.txt");
            fw = new FileWriter("fichero_sal.txt");

            int caracter;
            while ((caracter = fr.read()) != -1) {
                fw.write(caracter);
            }
        } finally {
            if (fr != null) {
                fr.close();
            }
            if (fw != null) {
                fw.close();
            }
        }
    }
}
