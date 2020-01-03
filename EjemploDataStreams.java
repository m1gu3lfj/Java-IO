package mipaquete;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploDataStreams {
	static final String fichero = "datos.txt";
	static final double[] precios = { 19.99, 7.99, 11.99, 6.99, 3.99 };
	static final int[] cantidad = { 11, 6, 12, 25, 30 };
	static final String[] articulos = {"Camiseta", "Taza", "Gorra", "Llavero", "Calcetines"};

	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fichero)));
		
		for (int i = 0; i < precios.length; i ++) {
		    out.writeDouble(precios[i]);
		    out.writeInt(cantidad[i]);
		    out.writeUTF(articulos[i]);
		}
		out.close();

		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(fichero)));
		try {
			double precio;
			int cantidad;
			String articulo;
		    while (true) {
		        precio = in.readDouble();
		        cantidad = in.readInt();
		        articulo = in.readUTF();
		        System.out.format("%2d unidades de %-10s a %5.2f€%n", cantidad, articulo, precio);
		    }
		} catch (EOFException e) {
		}
		in.close();
	}
}
