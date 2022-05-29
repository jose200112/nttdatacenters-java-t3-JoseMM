package nttdata.javat3;

import nttdata.javat3.business.ManagementServiceImpl;

/**
 * Clase que contiene el metodo main
 * 
 * @author jose
 *
 */
public class T3MainJoseMM {
	/**
	 * Metodo main
	 * 
	 * @param args (main)
	 */
	public static void main(String[] args) {
		ManagementServiceImpl m = new ManagementServiceImpl();

		// Agregamos 3 estudiantes
		m.addNewPerson("S", "Jose", "1234345F", "Sotero", "DAW", null, null);
		m.addNewPerson("S", "Laura", "3424321S", "Alixar", "DAM", null, null);
		m.addNewPerson("S", "Marta", "4562354R", "Sotero", "DAW", null, null);

		// Agregamos 3 empleados
		m.addNewPerson("E", "Juan", "4523654E", null, null, "Naturgy", "Analista");
		m.addNewPerson("E", "Nerea", "4583453S", null, null, "CaixaBank", "Programador junior");
		m.addNewPerson("E", "Elena", "4529102F", null, null, "Naturgy", "Jefe de proyecto");

		// Imprime todas las personas
		m.printAllPersons();

		// Borra al estudiante jose
		m.deletePerson("1234345F");

		// Comprueba si el estudiante jose aun se encuentra
		m.containsPerson("1234345F");

		// Imprimimos cuantas personas hay en total
		m.printPersonsTotalNum();
	}
}
