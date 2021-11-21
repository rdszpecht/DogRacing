package DogRacing;

import java.util.*;
public class MainPerro {
	public static void main (String args []) {
	System.out.println("Bienvenido a la primer carrera de perros ");	
	Scanner datos = new Scanner (System.in);
	System.out.println("Introduzca el nombre de su mascota");
	String p1n = datos.next();
	System.out.println("Introduzca la raza de su perro");
	String p1r = datos.next();
	Perro p1 = new Perro(p1n,p1r);
	System.out.println("Introduzca el nombre de su mascota");
	String p2n = datos.next();
	System.out.println("Introduzca la raza de su perro");
	String p2r = datos.next();
	Perro p2 = new Perro(p2n,p2r);
	String ganador = "";
	String perdedor = "";
	System.out.println(p1.getNombrePerro() + " tiene una velocidad de " + p1.getVelocidadPerro());
	System.out.println(p2.getNombrePerro() + " tiene una velocidad de " + p2.getVelocidadPerro());

	if (p1.getVelocidadPerro()>p2.getVelocidadPerro()) {
		System.out.println(p1.getNombrePerro() + " es el perro m�s r�pido");
		ganador = p1.getNombrePerro();
		perdedor = p2.getNombrePerro();
	}else if ((p2.getVelocidadPerro()>p1.getVelocidadPerro())) {
		System.out.println(p2.getNombrePerro()+ " es el perro m�s r�pido");
		ganador = p2.getNombrePerro();
		perdedor = p1.getNombrePerro();
	}else {
		System.out.println("Ambos perros corren lo mismo");
		
			} 
				
	System.out.println("Como premio a "+ ganador + " ,ganador de la carrera, podr� elegir un premio para �l");
	System.out.println("1.Pack de cuerdas para tirar");
	System.out.println("2.Cama de perro");
	System.out.println("3.Pack de pelotas");
	System.out.println("4.Botella de agua para perros");
	String premiowiner = "";
	int opcionwiner = datos.nextInt();
	switch (opcionwiner) {
	case 1: 
		 premiowiner = "un pack de cuerdas para tirar";
		 break;
	case 2:
		 premiowiner = "una cama de perro ";
		 break;
	case 3:
		 premiowiner = "un pack de pelota ";
		 break;
	default :
		 premiowiner = "una botella de agua para perros";	
	}
	
	System.out.println( ganador + " ha obtenido " + premiowiner + " como recomensa por su victoria y un cuenco personalizado con su nombre!");
	System.out.println( perdedor + " se lleva otro cuenco personalizado por su participaci�n!");
	
	System.out.println(" ������Muchas Gracias por participar !!!!!!");
	datos.close();
	}
}
	
