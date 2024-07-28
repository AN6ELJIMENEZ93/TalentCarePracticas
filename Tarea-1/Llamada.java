import java.util.Scanner;

public class Llamada {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double costo = 0;

       System.out.print("Por favor, introduce la clave de la zona a donde quieres marcar: ");
        int clave = scanner.nextInt();
		while (clave != 12 && clave != 15 && clave != 18 && clave != 19 && clave != 23 && clave != 25 && clave != 29) {
			System.out.println("Clave invalida, por favor introduzca una clave correcta: ");
			clave = scanner.nextInt();
		}
		if (clave == 12) {
			System.out.println("Usted esta marcando a America del Norte!");
			System.out.println("Introduzca los minutos de duracion de la llamada: ");
			int min = scanner.nextInt();
			costo = min * 2;
		} else if(clave == 15) {
			System.out.println("Usted esta marcando a America Central!");
			System.out.println("Introduzca los minutos de duracion de la llamada: ");
			int min = scanner.nextInt();
			costo = min * 2.2;
		} else if (clave == 18) {
			System.out.println("Usted esta marcando a America del Sur!");
			System.out.println("Introduzca los minutos de duracion de la llamada: ");
			int min = scanner.nextInt();
			costo = min * 4.5;
		} else if (clave == 19) {
			System.out.println("Usted esta marcando a Europa!");
			System.out.println("Introduzca los minutos de duracion de la llamada: ");
			int min = scanner.nextInt();
			costo = min * 3.5;
		} else if (clave == 23) {
			System.out.println("Usted esta marcando a Asia!");
			System.out.println("Introduzca los minutos de duracion de la llamada: ");
			int min = scanner.nextInt();
			costo = min * 6;
		} else if (clave == 25) {
			System.out.println("Usted esta marcando a Africa!");
			System.out.println("Introduzca los minutos de duracion de la llamada: ");
			int min = scanner.nextInt();
			costo = min * 6;
		} else if(clave == 29) {
			System.out.println("Usted esta marcando a Oceania!");
			System.out.println("Introduzca los minutos de duracion de la llamada: ");
			int min = scanner.nextInt();
			costo = min * 5;
		} else {
			System.out.println("");	
		}

		System.out.println("Hola, el costo por la llamada con clave: " + clave + " es de: $" + costo);
		scanner.close();  

		


	}
}