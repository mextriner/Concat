/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenacion;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Concatenacion {

    public static Scanner in = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\t\tBIENVENIDO:\n\n");
        System.out.printf("Introduzca su nombre: ");
        String name = in.nextLine();
        System.out.printf("\n\nIntroduzca su apellidp: ");
        String surname = in.nextLine();
        String nameSurname = name.concat((" ")+surname);
        
        
        System.out.println("Hola, "+ nameSurname);
    }
    
}
