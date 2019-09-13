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
 * Entidad que representa a un due�o
 */
public class Owner {
	/**
	 * Representa el nombre de un due�o
	 */
	private String name;
	/**
	 * Representa el apellido de un due�o
	 */
	private String lastName;
	/**
	 * Representa el codigo de un due�o
	 */
	private String id;
	/**
	 * Representa la fecha de nacimiento de un due�o
	 */
	private String birthdate;
	/**
	 * Representa el tipo de mascota de un due�o
	 */
	private String typePet;
	/**
	 * Constructor de mascota
	 * @param name Representa el nombre de un due�o
	 * @param lastName Representa el apellido de un due�o
	 * @param id Representa el codigo de un due�o
	 * @param birthdate  Representa la fecha de nacimiento de un due�o  
	 * @param typePet Representa el tipo de mascota que tiene un due�o
	 * * */
	public Owner(String name, String lastName, String id, String birthdate, String typePet) {
		this.name = name;
		
		this.lastName = lastName;
		
		this.id = id;
		
		this.birthdate = birthdate;
		
		this.typePet = typePet;
	}
	/**
 	 * Este metodo sirve para saber el nombre del due�o. <br>
	 * <b>post: </b> Retorna nombre del due�o <br>
	 * @return name - nombre del due�o
 	 */	
	public String getName() {
		return name;
	}
	/**
 	 * Este metodo sirve para cambiar el nombre del due�o. <br>
	 * @param name nombre por el que se cambiara
 	 */	
	public void setName(String name) {
		this.name = name;
	}
	/**
 	 * Este metodo sirve para saber el apellido del due�o. <br>
	 * <b>post: </b> Retorna el apellido del due�o <br>
	 * @return lastName - apellido del due�o
 	 */	
	public String getLastName() {
		return lastName;
	}
	/**
 	 * Este metodo sirve para cambiar el apellido del due�o. <br>
	 * @param lastName apellido por el que se cambiara
 	 */	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
 	 * Este metodo sirve para saber el codigo del due�o. <br>
	 * <b>post: </b> Retorna el codigo del due�o <br>
	 * @return id - codigo del due�o
 	 */	
	public String getId() {
		return id;
	}
	/**
 	 * Este metodo sirve para cambiar el codigo del due�o. <br>
	 * @param id codigo por el que se cambiara
 	 */	
	public void setId(String id) {
		this.id = id;
	}
	/**
 	 * Este metodo sirve para saber la fecha de nacimiento del due�o. <br>
	 * <b>post: </b> Retorna la fecha de nacimiento del due�o <br>
	 * @return birthdate - fecha de nacimiento del due�o
 	 */	
	public String getBirthdate() {
		return birthdate;
	}
	/**
 	 * Este metodo sirve para cambiar la fecha de nacimiento del due�o. <br>
	 * @param birthdate fecha por la que se cambiara
 	 */	
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	/**
 	 * Este metodo sirve para saber el tipo de mascota que tiene del due�o. <br>
	 * <b>post: </b> Retorna el tipo de mascota del due�o <br>
	 * @return typePet - tipo de mascota del due�o
 	 */	
	public String getTypePet() {
		return typePet;
	}
	/**
 	 * Este metodo sirve para cambiar el tipo de mascota  del due�o. <br>
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
