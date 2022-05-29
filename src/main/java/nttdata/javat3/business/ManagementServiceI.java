package nttdata.javat3.business;

/**
 * Interfaz que contiene los metodos agregar e imprimir personas
 * 
 * @author jose
 *
 */
public interface ManagementServiceI {

	/**
	 * Metodo que agrega personas
	 * 
	 * @param kind    (tipo)
	 * @param nombre  (nombre)
	 * @param dni     (dni)
	 * @param school  (Centro educativo)
	 * @param mode    (Modalidad)
	 * @param project (Proyecto)
	 * @param rank    (Categoria)
	 */
	public void addNewPerson(String kind, String nombre, String dni, String school, String mode, String project,
			String rank);

	/**
	 * Metodo que imprime todas las personas
	 */
	public void printAllPersons();
}
