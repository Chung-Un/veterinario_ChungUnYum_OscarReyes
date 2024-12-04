/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veterinario;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Veterinario {

    /**
     * @param args the command line arguments
     */
    static funciones funciones = new funciones();

    public static void main(String[] args) {
     String salir= "";
     String especie, atencion,size, tipoAtencion;
     Scanner entrada= new Scanner (System.in);
     boolean atencionBool;
     int precio,opcion;
     animales animal = null;
     
      while(!salir.equals("s")){
      
          System.out.println("============Nuevo cliente============\nIngrese la especie de su animal: ");
          especie = entrada.nextLine();
          
          System.out.println("Ingrese el size de su mascota: \n1.Small\n2.Mediana\n3.Grande");
          opcion = entrada.nextInt();
          size = funciones.size(opcion);
          entrada.nextLine();

          
          System.out.println("Desea atencion medica o grooming?(m/g)");
          atencion = entrada.nextLine();
          atencionBool = funciones.atencionBool(atencion);
          tipoAtencion = funciones.atencion(atencionBool);
          
          animal = funciones.registrar(size, especie, atencionBool);
          precio= funciones.precio(animal, size);
          
          funciones.reporteFinal();
          
          funciones.facturar(animal,tipoAtencion,precio);
            
          System.out.println("Desea salir?(s/n):");
          salir = entrada.nextLine().toLowerCase();
      
      
      
      }  

      funciones.imprimirReporte();
    }
    
}
