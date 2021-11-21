package DogRacing;

public class Perro {
	private String nombre;
	private String raza;
	private double velocidad;
	
	public Perro () {
		this.nombre ="Desconocido";
		this.raza = "Mestizo";
		this.velocidad= velraza();
	}

	public Perro(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
		this.velocidad= velraza();
	}
	private  double velraza() {
		switch (this.raza) {
		case "galgo":
			return velocidad=(Math.random()*(10-9))+9;
			
		case "labrador":
			return velocidad=(Math.random()*(10-7))+7;
			
		case "bordercolie":
			return velocidad=(Math.random()*(10-7))+7;
			
		case "doberman":
			return velocidad=(Math.random()*(10-8))+8;
			
		case "dalmata":
			return velocidad=(Math.random()*(10-8))+8;
			
		default :
			return velocidad=(Math.random()*(10-9))+9;
						
	}
		
		}
	
	public String getNombrePerro() {
		return nombre;
	}
	
	
	public double getVelocidadPerro() {
		return velocidad;
	}
}
	
	
