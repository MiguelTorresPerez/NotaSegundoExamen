/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasegundoexamen;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class NotaSegundoExamen {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la nota del primer examen");
        double notaprimerexamen = sc.nextDouble();
        System.out.println("¿Que nota quieres sacar en el trimestre?");
        double notafinal = sc.nextDouble();
        if ((notaprimerexamen>=0 && notaprimerexamen<=10) && (notafinal>=0 && notaprimerexamen<=10)) {
        double notasegundoexamen;
        notasegundoexamen = (notafinal-0.4*notaprimerexamen)/0.6;
      System.out.printf("Para tener un "+notafinal+" en el trimestre necesitas sacar un %.2f"+" en el segundo examen.\n", notasegundoexamen);
        }
    }
}
