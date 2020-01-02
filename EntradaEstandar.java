package mipaquete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaEstandar {
    
    public static void main (String args[]) throws IOException {
    	System.out.println("Escriba antigua contraseña:");
    	InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader (isr);
    	String antigua = br.readLine();
        do {
          	System.out.println("Escriba nueva contraseña:");
           	String nueva1 = br.readLine();
           	if (antigua.equals(nueva1)) {
           		System.err.println("Contraseña nueva incorrecta\n");
           		continue;
           	}
           	System.out.println("Escriba nueva contraseña otra vez:");
           	String nueva2 = br.readLine();
           	if (nueva1.equals(nueva2)) {
           		break;
           	} else {
           		System.err.println("Contraseña nueva incorrecta\n");
           	}
        } while (true);
        System.out.println("Contraseña cambiada correctamente");
    }
}
