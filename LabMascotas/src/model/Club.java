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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Entidad que representa a un Club
 */
public class Club implements Comparable<Object>{
	/**
	 * Representa el nombre del club
	 */
	private String name;
	/**
	 * Representa la id del club
	 */
	private String idC;
	/**
	 * Representa la fecha de creacion del club
	 */
	private String createDate;
	/**
	 * Representa los tipos de animales en el club
	 */
	private String typeAnimal;
	/**
	 * Arraylist que contiene los dueños
	 */
	private ArrayList <Owner> owners;
	
	/**
	 * Constructor de club
	 * @param idC Representa el codigo del club
	 * @param name Representa el nombre del Club
	 * @param createDate Representa la fecha de creacion del Club
	 * @param typeAnimal Representa los tipos de animales en el Club 
	 */
	public Club(String idC, String name, String createDate, String typeAnimal) {
		this.idC = idC;
		
		this.name = name;
		
		this.createDate = createDate;
		
		this.typeAnimal = typeAnimal;
		
		ArrayList <Owner> owners= new ArrayList<Owner>();
	}
	
	/**
 	 * Este metodo sirve para saber el id del club. <br>
	 * <b>post: </b> Retorna id del club <br>
	 * @return idC - id del club
 	 */	
	public String getIdC() {
		return idC;
	}
	
	/**
 	 * Este metodo sirve para cambiar el id del club. <br>
	 * @param idC id por el que se cambiara
 	 */	
	public void setIdc(String idC) {
		this.idC = idC;
	}
	/**
 	 * Este metodo sirve para saber el nombre del club. <br>
	 * <b>post: </b> Retorna nombre del club <br>
	 * @return name - nombre del club
 	 */	
	public String getName() {
		return name;
	}
	/**
 	 * Este metodo sirve para cambiar el id del club. <br>
	 * @param idC id por el que se cambiara
 	 */	
	public void setName(String name) {
		this.name= name;
	}
	/**
 	 * Este metodo sirve para saber la fecha de creacion del club. <br>
	 * <b>post: </b> Retorna fecha de creacion del club <br>
	 * @return createDate - fecha de creacion del club
 	 */	
    public String getCreateDate() {
		return createDate;
	}
    /**
 	 * Este metodo sirve para cambiar la fecha de creacion del club. <br>
	 * @param createDate fecha de creacion por el que se cambiara
 	 */	
    public void setCreateDate(String createDate) {
    	this.createDate=createDate;
    }
    /**
 	 * Este metodo sirve para saber el tipo de animal del club. <br>
	 * <b>post: </b> Retorna tipo de animal del club <br>
	 * @return typeAnimal - tipo de animal del club
 	 */	
    public String getTypeAnimal() {
		return typeAnimal;
	}
    /**
 	 * Este metodo sirve para cambiar el tipo de animal del club. <br>
	 * @param typeAnimal tpo de animal por el que se cambiara
 	 */	
    public void setTypeAnimal(String typeAnimal) {
    	this.typeAnimal = typeAnimal;
    }
	
	/**
	 * este metodo sirve como lector de archivos
	 */
	public ArrayList<Owner> leerArchivo() throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fIS = null;
		ObjectInputStream input = null;
		ArrayList<Owner> owner = null;
		try {
			
		fIS = new FileInputStream("./src/datos.dat");
			input = new ObjectInputStream(fIS);

			owners = (ArrayList<Owner>) input.readObject();

		} catch (FileNotFoundException exc) {
			
			
			owner=new ArrayList<Owner>();
		  } catch (ClassNotFoundException exc) {
			  
	            System.out.println(exc.getMessage());
	        } catch (IOException exc) {
	            System.out.println(exc.getMessage());
	        } finally {
	            try {
	              if (fIS != null) {
	                	fIS.close();
	                	
	                }
	                if (input != null) {
	                    input.close();
	                }
	            } catch (IOException exc) {
	                System.out.println(exc.getMessage());
	            }
	        }	
		return owner;
	}
	
	/**
 	 * Este metodo sirve para serializar clubs . <br>
 	 */	
	public void serializarClub() throws FileNotFoundException, IOException, ClassNotFoundException{
		FileOutputStream fOS = null;
		ObjectOutputStream output = null;
		ArrayList<Owner> owner= leerArchivo();
		for (int i = 0; i <owner.size(); i++) {
			if(owner.get(i).getName().equalsIgnoreCase(owners.get(i).getName())) {
				owner.remove(i);
			}
		}
		owner.addAll(owners);

		try
		{
			fOS = new FileOutputStream("./src/data.dat");
			
			output = new ObjectOutputStream(fOS);		
			output.writeObject(owner);
		}catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}finally
		{
			try {
				if (owner != null)
				fOS.close();
				if (output != null)
				output.close();
			} catch (IOException e) {
			
				System.out.println(e.getMessage());
			}
		}
	}

	public int compareTo(Object ow) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	/**
 	 * Este metodo sirve para  comparar el nombre entre dueños. <br>
	 * <b>post: </b> Retorna la comparacion <br>
	 * @return name.compareTo(own.getName()); - comparacion entre dueños
 	 */	
	public int compareTo(Owner ow) {
		Owner own= (Owner)ow;
		return name.compareTo(own.getName());
	}
	
	/**
 	 * Este metodo sirve para  comparar la identificacion entre dueños. <br>
	 * <b>post: </b> Retorna la comparacion <br>
	 * @return uno.getId().compareTo(dos.getId()); - comparacion entre dueños
 	 */	
	public int compare(Owner uno, Owner dos) {
		
		return uno.getId().compareTo(dos.getId());
	}

	/**
 	 * Este metodo sirve para  comparar apellidos entre dueños. <br>
	 * <b>post: </b> Retorna la comparacion <br>
	 * @return uno.getLastName().compareTo(dos.getLastName()) - comparacion entre dueños
 	 */	
	public int compareOne(Owner uno, Owner dos) {
		
		return uno.getLastName().compareTo(dos.getLastName());
	}
	/**
 	 * Este metodo sirve para  comparar fechas de nacimiento entre dueños. <br>
	 * <b>post: </b> Retorna la comparacion <br>
	 * @return uno.getBirthdate().compareTo(dos.getBirthdate()) - comparacion entre dueños
 	 */	
	public int compareTwo(Owner uno, Owner dos) {
		
		return uno.getBirthdate().compareTo(dos.getBirthdate());
	}
	/**
 	 * Este metodo sirve para  comparar tipos de mascotas entre dueños. <br>
	 * <b>post: </b> Retorna la comparacion <br>
	 * @return uno.getTypePet().compareTo(dos.getTypePet())- comparacion entre dueños
 	 */	
	public int compareThree(Owner uno, Owner dos) {
		return uno.getTypePet().compareTo(dos.getTypePet());
	}
	
	/**
 	 * Este metodo sirve para  ordenar los dueños por nombre. <br>
	 * @param ArrayList<Owner> owners arreglo de dueños
 	 */	
	   public void sortName(ArrayList<Owner> owners) {
		for (int i = 0; i < owners.size()-1; i++) {
		Owner mId = owners.get(i);
		int mPos = i;
				
		for (int J = i+1; J < owners.size(); J++) {
		Owner currentId = owners.get(J);
		if(mId.compareTo(currentId)==1) {
		mId = currentId;
		mPos = J;
					}
				}
				
				Owner tmp = owners.get(mPos);
				owners.set(mPos, owners.get(i));
				owners.set(i, tmp);
			}
		}
	   /**
	 	 * Este metodo sirve para  ordenar los dueños por identificacion. <br>
		 * @param ArrayList<Owner> owners arreglo de dueños
	 	 */	
	   public void sortById(ArrayList<Owner> owners) {
	for (int i = 0; i < owners.size()-1; i++) {
				Owner mId = owners.get(i);
				int mPosition = i;
				
				for (int j = i+1; i < owners.size(); j++) {
					Owner currentId = owners.get(j);
					if(compare(mId,currentId)==1) {
						mId = currentId;
						mPosition = j;
					}
				}
				
				Owner tmp = owners.get(mPosition);
				owners.set(mPosition, owners.get(i));
				owners.set(i, tmp);
			}
		}
	   
	   /**
	 	 * Este metodo sirve para  ordenar los dueños por apellido. <br>
		 * @param ArrayList<Owner> owners arreglo de dueños
	 	 */	
	   public void sortByLastName(ArrayList<Owner> owners) {
		   
		for (int i = 0; i < owners.size()-1; i++) {
		
			Owner mId = owners.get(i);
		int mPosition = i;
				
				for (int j = i+1; j < owners.size(); j++) {
					
					Owner currentId = owners.get(j);
			if(compareOne(mId, currentId)==1) {
				mId = currentId;
					mPosition = j;
					}
				}
				
				Owner tmp = owners.get(mPosition);
				
				owners.set(mPosition, owners.get(i));
				owners.set(i, tmp);
			}
		}
	   /**
	 	 * Este metodo sirve para  ordenar los dueños por fecha de nacimiento. <br>
		 * @param ArrayList<Owner> owners arreglo de dueños
	 	 */	
	    public void sortByBirthdate(ArrayList<Owner> owners) {
	    	
		for (int i = 0; i < owners.size()-1; i++) {
				Owner mId = owners.get(i);
				int mPosition = i;
				
			for (int j = i+1; j < owners.size(); j++) {
					
					Owner currentId = owners.get(j);
					if(compareTwo(mId,currentId)==1) {
						mId = currentId;
						mPosition = j;
					}
				}
				
				Owner tmp = owners.get(mPosition);
				owners.set(mPosition, owners.get(i));
				owners.set(i, tmp);
			}
		}
	    /**
	 	 * Este metodo sirve para  ordenar los dueños por tipo de mascota. <br>
		 * @param ArrayList<Owner> owners arreglo de dueños
	 	 */	
	   	   public void sortByTypeP(ArrayList<Owner> owners) {
	   		   
			for (int i = 0; i < owners.size()-1; i++) {
				Owner mId = owners.get(i);
				int mPosition = i;
				
			for (int j = i+1; j < owners.size(); j++) {
				
				Owner currentId = owners.get(j);
					if(compareThree(mId,currentId)==1) {
						mId = currentId;
						mPosition = j;
					}
				}
				
				Owner tmp = owners.get(mPosition);
				owners.set(mPosition, owners.get(i));
				owners.set(i, tmp);
			}
		}
	   
	   	/**
	    	 * Esta exepcion sirve para verificar si el dueño ya ha sido registrado por su identificacion. <br>
	    	 */	
	   public void addOwner( Owner own) throws Exception  {
			if(owners!=null) {
				
		for (int i = 0; i < owners.size();i++) {		
		if(owners.equals(own.getId())) {
			throw new Exception(" that identification has already been used");
			
		}else {
				owners.add(own);
			}
			}
			}
		}
}
