package nttdata.javat3.business;

/**
 * Clase abstracta Persona
 * 
 * @author jose
 *
 */
public abstract class Person {
	private final String dni;
	private String name;

	/**
	 * Constructor de la clase Persona
	 * 
	 * @param dni  (dni)
	 * @param name (nombre)
	 */
	public Person(String dni, String name) {
		this.dni = dni;
		this.name = name;
	}

	/**
	 * Metodo getter de nombre
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Metodo getter de dni
	 * 
	 * @return dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Metodo toString personalizado para la clase Persona
	 */
	@Override
	public String toString() {
		return "Nombre: " + name + ", DNI: " + dni;
	}

}
