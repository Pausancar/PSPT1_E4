package es.studium.Ejercicio4PSPT1; 
import java.io.IOException; 
public class Ejercicio4
{ 
	public static void main(String[] args) throws IOException 
	{ 
		if (args.length !=2) //Este programa siempre funciona con alg�n argumento si no le pasamos argumento da error
		{ 
			System.exit(-1);//Este n�mero lo recibe el SO o otro programa que est� usando este programa JAVA
		} 
		else
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.exit(a + b);
		}
	}
}