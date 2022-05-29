package nttdata.javat3.business;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase ManagementServiceImpl que implementa la interfaz ManagementServiceI
 * 
 * @author jose
 *
 */
public class ManagementServiceImpl implements ManagementServiceI {
	private static final Logger LOG = LoggerFactory.getLogger(ManagementServiceImpl.class);
	Map<String, Person> database = new HashMap<String, Person>();

	/**
	 * Metodo que agrega personas
	 */
	public void addNewPerson(String kind, String name, String dni, String school, String mode, String project,
			String rank) {

		if (kind.equalsIgnoreCase("S")) {
			Student s = new Student(dni, name, school, mode);
			database.put(dni, s);
			LOG.info("Estudiante dado de alta con exito");
		}

		if (kind.equalsIgnoreCase("E")) {
			Employee e = new Employee(dni, name, rank, project);
			database.put(dni, e);
			LOG.info("Empleado dado de alta con exito");
		}

	}

	/**
	 * Metodo que imprime todas las personas
	 */
	public void printAllPersons() {
		Iterator<String> iter = database.keySet().iterator();
		while (iter.hasNext()) {
			System.out.println(database.get(iter.next()));
		}

	}

	/**
	 * Metodo que comprueba si una persona esta de alta
	 * 
	 * @param dni (DNI)
	 */
	public void containsPerson(String dni) {
		if (database.containsKey(dni)) {
			LOG.info("La persona: {} se encuentra de alta", database.get(dni));
		} else {
			LOG.info("Esa persona no se encuentra de alta");
		}
	}

	/**
	 * Metodo que da de baja a una persona
	 * 
	 * @param dni (DNI)
	 */
	public void deletePerson(String dni) {
		if (database.containsKey(dni)) {
			database.remove(dni);
			LOG.info("Persona dada de baja con exito");
		} else {
			LOG.info("Esa persona no se encuentra de alta");
		}
	}

	/**
	 * Metodo que imprime el numero total de personas
	 */
	public void printPersonsTotalNum() {
		LOG.info("En total hay {} personas", database.size());
	}
}
