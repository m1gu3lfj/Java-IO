package mipaquete;

public class FormateaString {

	public static void main(String[] args) {
		String o = "raíz cuadrada";
		int i = 2;
        	double r = Math.sqrt(i);
        
        	System.out.println("La "+ o +" de " + i + " es " + r);
        	System.out.format("La %s de %d es %f%n", o, i, r);
    	}
}
