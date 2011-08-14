/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package infoservidor;

/**
 *
 * @author Fellipe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Vers?o Java: "+ System.getProperty("java.version"));
        System.out.println("Diretorio Java: "+ System.getProperty("java.home"));
        System.out.println("Sistema Operacional: "+ System.getProperty("os.name") + " - Vers?o: "+System.getProperty("os.version") );
        System.out.println("Usuario: "+ System.getProperty("user.name"));
        System.out.println("Diretorio Usuario: "+ System.getProperty("user.home"));

        System.out.println("--------------------------------------------------------------");
        System.out.println("alteracao para outro commit");
        
    }

}
