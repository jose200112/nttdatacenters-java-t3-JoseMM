package nttdata.javat3.business;

/**
 * Clase empleado
 * 
 * @author jose
 *
 */
public class Employee extends Person {
	private String project;
	private String rank;

	/**
	 * Constructor de la clase Empleado
	 * 
	 * @param dni     (dni)
	 * @param name    (nombre)
	 * @param rank    (categoria)
	 * @param project (proyecto)
	 */
	public Employee(String dni, String name, String rank, String project) {
		super(dni, name);
		this.project = project;
		this.rank = rank;
	}

	/**
	 * getter de proyecto
	 * 
	 * @return project
	 */
	public String getProject() {
		return project;
	}

	/**
	 * getter de categoria
	 * 
	 * @return rank
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * toString personalizado para la clase Empleado
	 */
	@Override
	public String toString() {
		return super.toString() + ", proyecto: " + project + ", categoria: " + rank;
	}

}
