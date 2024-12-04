/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinario;

/**
 *
 * @author chung
 */
public class animales {
    String size,tipo, especie; 
    boolean atencionBool;
    static int i = 0;
    static animales[] ArrayAnimal = new animales[10];
    funciones funciones=  new funciones();
    
public animales (String size,String especie, boolean atencionBool){
this.size = size;
this.especie = especie;
this.atencionBool = atencionBool;
 

}

boolean getAtencionBool(){
    return atencionBool;
}



    
}
