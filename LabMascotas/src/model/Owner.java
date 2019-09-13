/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad ICESI (Cali - Colombia)
 * Ingenieria de Sistemas 
 *
 * Laboratorio 2 
 * Autor: Brayan Stiven Bohorquez Escobar
 * Estudiante de ingnieria de sistemas
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package model;
/**
 * Entidad que representa a un dueño
 */
public class Owner {
	/**
	 * Representa el nombre de un dueño
	 */
	private String name;
	/**
	 * Representa el apellido de un dueño
	 */
	private String lastName;
	/**
	 * Representa el codigo de un dueño
	 */
	private String id;
	/**
	 * Representa la fecha de nacimiento de un dueño
	 */
	private String birthdate;
	/**
	 * Representa el tipo de mascota de un dueño
	 */
	private String typePet;
	/**
	 * Constructor de mascota
	 * @param name Representa el nombre de un dueño
	 * @param lastName Representa el apellido de un dueño
	 * @param id Representa el codigo de un dueño
	 * @param birthdate  Representa la fecha de nacimiento de un dueño  
	 * @param typePet Representa el tipo de mascota que tiene un dueño
	 * * */
	public Owner(String name, String lastName, String id, String birthdate, String typePet) {
		this.name = name;
		
		this.lastName = lastName;
		
		this.id = id;
		
		this.birthdate = birthdate;
		
		this.typePet = typePet;
	}
	/**
 	 * Este metodo sirve para saber el nombre del dueño. <br>
	 * <b>post: </b> Retorna nombre del dueño <br>
	 * @return name - nombre del dueño
 	 */	
	public String getName() {
		return name;
	}
	/**
 	 * Este metodo sirve para cambiar el nombre del dueño. <br>
	 * @param name nombre por el que se cambiara
 	 */	
	public void setName(String name) {
		this.name = name;
	}
	/**
 	 * Este metodo sirve para saber el apellido del dueño. <br>
	 * <b>post: </b> Retorna el apellido del dueño <br>
	 * @return lastName - apellido del dueño
 	 */	
	public String getLastName() {
		return lastName;
	}
	/**
 	 * Este metodo sirve para cambiar el apellido del dueño. <br>
	 * @param lastName apellido por el que se cambiara
 	 */	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
 	 * Este metodo sirve para saber el codigo del dueño. <br>
	 * <b>post: </b> Retorna el codigo del dueño <br>
	 * @return id - codigo del dueño
 	 */	
	public String getId() {
		return id;
	}
	/**
 	 * Este metodo sirve para cambiar el codigo del dueño. <br>
	 * @param id codigo por el que se cambiara
 	 */	
	public void setId(String id) {
		this.id = id;
	}
	/**
 	 * Este metodo sirve para saber la fecha de nacimiento del dueño. <br>
	 * <b>post: </b> Retorna la fecha de nacimiento del dueño <br>
	 * @return birthdate - fecha de nacimiento del dueño
 	 */	
	public String getBirthdate() {
		return birthdate;
	}
	/**
 	 * Este metodo sirve para cambiar la fecha de nacimiento del dueño. <br>
	 * @param birthdate fecha por la que se cambiara
 	 */	
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	/**
 	 * Este metodo sirve para saber el tipo de mascota que tiene del dueño. <br>
	 * <b>post: </b> Retorna el tipo de mascota del dueño <br>
	 * @return typePet - tipo de mascota del dueño
 	 */	
	public String getTypePet() {
		return typePet;
	}
	/**
 	 * Este metodo sirve para cambiar el tipo de mascota  del dueño. <br>
	 * @param typePet fecha por la que se cambiara
 	 */	
	public void setTypePet(String typePet) {
		this.typePet = typePet;
	}
	
	
	
	public int compareToTypePet(Owner typePet) {
		return getTypePet().compareToIgnoreCase(typePet.getTypePet());
	}
	
	public int compareTo(Owner currentId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
