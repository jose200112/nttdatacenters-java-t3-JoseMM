package nttdata.javat3.business;

/**
 * Clase Estudiante
 * 
 * @author jose
 *
 */
public class Student extends Person {
	private String school;
	private String mode;

	/**
	 * Constructor de la clase Estudiante
	 * 
	 * @param dni    (dni)
	 * @param name   (nombre)
	 * @param school (centro educativo)
	 * @param mode   (modalidad)
	 */
	public Student(String dni, String name, String school, String mode) {
		super(dni, name);
		this.school = school;
		this.mode = mode;
	}

	/**
	 * Metodo getter de centro educativo
	 * 
	 * @return school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * Metodo getter de modalidad
	 * 
	 * @return mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * toString personalizado para la clase Empleado
	 */
	@Override
	public String toString() {
		return super.toString() + ", centro educativo: " + school + ", modalidad: " + mode + "";
	}

}
