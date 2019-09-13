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
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Entidad que representa a una entidad que organiza los clubes
 */
	public class ClubManager implements Comparator<Object>{
		/**
		 * Arraylist que contiene los clubs
		 */
	private ArrayList<Club>clubs;
 
	/**
	 * Constructor de mascota
	 * @param Arrayist<Club> arraylist que contiene los clubes
	 */
 public ClubManager(ArrayList<Club> clubs) {
		this.clubs = clubs;
	}
 /**
	 * Este metodo sirve para saber los clubes del arraylist. <br>
	 * <b>post: </b> Retorna los clubes que estan en el arraylist <br>
	 * @return clubs - clubes del arraylist
	 */	
	public ArrayList<Club> getClub() {
		return clubs;
	}

	/**
 	 * Este metodo sirve para cambiar el  nombre de la mascota. <br>
	 * @param name el nombre que se cambiara
 	 */	
	public void setClub(ArrayList<Club> club) {
		this.clubs = club;
	}

	/**
 	 * Este metodo sirve para  comparar nombres entre clubes. <br>
	 * <b>post: </b> Retorna la comparacion <br>
	 * @return cUno.getName().compareTo(cDos.getName()) comparacion 
 	 */	
	@Override
	public int compare(Object uno, Object dos) {
		Club cUno=(Club)uno;
		
		Club cDos=(Club)dos;
		return cUno.getName().compareTo(cDos.getName());
	}
	/**
 	 * Este metodo sirve para  comparar fecha de creaciones entre clubes. <br>
	 * <b>post: </b> Retorna la comparacion <br>
	 * @return cUno.getName().compareTo(cDos.getName()) comparacion 
 	 */	
	public int compareUno(Club uno, Club dos) {
		
		
		return uno.getCreateDate().compareTo(dos.getCreateDate());
	}
	/**
 	 * Este metodo sirve para  comparar identificaciones entre clubes. <br>
	 * <b>post: </b> Retorna la comparacion <br>
	 * @return uno.getIdC().compareTo(dos.getIdC()) comparacion 
 	 */	
	public int compareDos(Club uno, Club dos) {
		
		
return uno.getIdC().compareTo(dos.getIdC());
	} 
	/**
 	 * Este metodo sirve para  comparar tipos de mascotas entre clubes. <br>
	 * <b>post: </b> Retorna la comparacion <br>
	 * @return uno.getType().compareTo(dos.getType()) comparacion 
 	 */	
	public int compareTres(Club uno, Club dos) {
		
		
		
		return uno.getTypeAnimal().compareTo(dos.getTypeAnimal());
	}
	
	/**
 	 * Este metodo sirve para  ordenar por nombre los clubes. <br>
	 * @param ArrayList<Club> clubs
	 * */
	public void sortName(ArrayList<Club> clubs) {
	Club tmp;
	for (int i = 0; i < clubs.size()-1; i++) {
	for (int j = 0; j < clubs.size()-i-1; j++){				
   
		
		
		if(compare(clubs.get(j),clubs.get(j+1))==1) {
	 tmp=clubs.get(j);
	 clubs.set(j,clubs.get(j+1));
	 clubs.set(j+1, tmp);
					}
    }
	}
	}
	
	/**
 	 * Este metodo sirve para  ordenar por fecha los clubes. <br>
	 * @param ArrayList<Club> clu
	 * */
	public  void sortDate(ArrayList<Club> clubs){
		
    for (int p = 1; p < clubs.size(); p++){ 
    Club aux = clubs.get(p); 
	 int  j = p ;
    while (j>0 && compareUno(clubs.get(j-1),aux)==1) { 		                                                    
		 clubs.set(j, clubs.get(j-1));   
		  j--;                  
		  } clubs.set(j,aux);
	   }
	 }
		
	/**
 	 * Este metodo sirve para  ordenar por identificacion los clubes. <br>
	 * @param ArrayList<Club> c
	 * */
	   public void sortById(ArrayList<Club> clubs) {
	 for (int i = 0; i < clubs.size()-1; i++) {
		Club minId = clubs.get(i);
	int minPos = i;
	for (int j = i+1; j < clubs.size(); j++) {
		Club currentId = clubs.get(j);
	if(compareDos(minId,currentId)==1) {
			minId = currentId;
		    minPos = j;
			}
			}
				
		Club tmp = clubs.get(minPos);
				clubs.set(minPos, clubs.get(i));
				clubs.set(i, tmp);
			}
			}
	   
	   /**
	 	 * Este metodo sirve para  ordenar por tipo de mascota los clubes. <br>
		 * @param ArrayList<Club> c
		 * */
		   public void sortByTypePet(ArrayList<Club> c) {
	for (int i = 0; i < c.size()-1; i++) {
		Club minId = c.get(i);
		int minPos = i;
	for (int j = i+1; j < c.size(); j++) {
		Club currentId = c.get(j);
		if(compareTres(minId,currentId)==1) {
		minId = currentId;
			minPos = j;
						}
					}
					Club tmp = c.get(minPos);
					c.set(minPos, c.get(i));
					c.set(i, tmp);
				}
		   }
}
