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
 * Entidad que representa a una mascota
 */
public class Pet{
	/**
	 * Esta constante representa el genero masculino de las mascotas
	 */
	public static String MALE = "male";
	/**
	 * Esta constante representa el genero femenino de las mascotas
	 */
	public static String FEMALE = "female";
	
	/**
	 * Representa el nombre de la mascota
	 */
	private String name;
	/**
	 * Representa la fecha de nacimiento de la mascota
	 */
	private String birthdate;
	/**
	 * Representa la identificacion de la mascota
	 */
	private String id;
	/**
	 * Representa el genero de la mascota
	 */
	private String gender;
	/**
	 * Representa el tipo de la mascota
	 */
	private String typePet;
	
	/**
	 * Constructor de mascota
	 * @param name Representa el nombre de la mascota
	 * @param birthdate  Representa la fecha de nacimiento de la mascota 
	 * @param id Representa el codigo de la mascota	 
	 * @param gender Representa el genero de la mascota
	 * @param typePet Representa el tipo de mascota
	 * * */
	public Pet(String name, String birthdate, String id, String gender, String typePet) {
		this.name = name;
		
		this.birthdate = birthdate;
		
		this.id = id;
		
		this.gender = gender;
		
		this.typePet = typePet;
	}

	/**
 	 * Este metodo sirve para saber el nombre de la mascota. <br>
	 * <b>post: </b> Retorna nombre de la mascota <br>
	 * @return name - nombre de la mascota
 	 */	
	public String getName() {
		return name;
	}
	
	/**
 	 * Este metodo sirve para cambiar el  nombre de la mascota. <br>
	 * @param name el nombre que se cambiara
 	 */	
	public void setName(String name) {
		this.name = name;
	}
	/**
 	 * Este metodo sirve para saber la fecha de nacimiento de la mascota. <br>
	 * <b>post: </b> Retorna fecha de nacimiento de la mascota <br>
	 * @return birthdate - nacimiento de la mascota
 	 */	
	public String getBirthdate() {
		return birthdate;
	}
	/**
 	 * Este metodo sirve para cambiar la fecha de nacimiento de la mascota. <br>
	 * @param birthday fecha que se cambiara
 	 */	
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	/**
 	 * Este metodo sirve para saber el codigo de la mascota. <br>
	 * <b>post: </b> Retorna codigo de la mascota <br>
	 * @return id - codigo de la mascota
 	 */	
	public String getId() {
		return id;
	}
	/**
 	 * Este metodo sirve para cambiar el  codigo de la mascota. <br>
	 * @param id el codigo que se cambiara
 	 */	
	public void setId(String id) {
		this.id = id;
	}
	/**
 	 * Este metodo sirve para saber el nombre de la mascota. <br>
	 * <b>post: </b> Retorna nombre de la mascota <br>
	 * @return name - nombre de la mascota
 	 */	
	public String getGender() {
		return gender;
	}
	/**
 	 * Este metodo sirve para cambiar el  genero de la mascota. <br>
	 * @param gender el genero que se cambiara
 	 */	
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
 	 * Este metodo sirve para saber el tipo de la mascota. <br>
	 * <b>post: </b> Retorna tipo de la mascota <br>
	 * @return typePet - tipo de la mascota
 	 */	
	public String getTypePet() {
		return typePet;
	}
	/**
 	 * Este metodo sirve para cambiar el  tipo de la mascota. <br>
	 * @param typePet el tipo que se cambiara
 	 */	
	public void setTypePet(String typePet) {
		this.typePet = typePet;
	}
}
	
	
	
	


