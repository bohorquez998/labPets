/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad ICESI (Cali - Colombia)
 * Ingenieria de Sistemas 
 *
 * Laboratorio 2 
 * Autor: Brayan Stiven Bohorquez Escobar
 * Estudiante de ingnieria de sistemas
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package ui;
import java.io.*;
import java.util.Scanner;
public class Main {
	
	Scanner sc = new Scanner(System.in);
	
	static void initialize() throws IOException {
		
		File file = new File("");
		FileReader fr = new FileReader(file);
		BufferedReader brFile = new BufferedReader(fr);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader brConsole = new BufferedReader(isr);
		
		int age = brConsole.read();	
	}
	
	public static void main(String[] args) throws IOException {
	
		Main menu = new Main();
		
		initialize();
	}

}
