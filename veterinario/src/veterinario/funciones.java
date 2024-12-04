/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinario;

/**
 *
 * @author chung
 */
public class funciones {
    int ContGroomin = 0, contAtencion = 0;
    
    public String size(int opcion){
    String size="";
        
    switch(opcion){
        case 1:
            size = "small";
            break;
        case 2: 
            size = "mediano";
            break;
        case 3:
            size = "grande";
            break;
    }
    return size;
    }
    
    public int precio (animales animal, String size){
    int precio=0;
   
    if (animal.atencionBool ){
    precio = 500;
    return precio;
    }
    
    if(!animal.atencionBool){
    
        switch (size) {
            case "small":
                precio = 400;
                break;
            case "mediano":
                precio = 500;
                break;
            case "grande":
                precio = 600;
                break;
            default:
                System.out.println("Size no reconocida.");
                break;
        }
    }
return precio;
}

public boolean atencionBool(String atencion){
boolean medica=true ;
    switch(atencion){
    
    case "m":
        medica = true;
        break;
        
    case "g":
        medica = false;
        break;
    default:
        System.out.println("Opcion invalida");
        break;


}
return medica;
}

public String atencion (boolean atencion){
String tipo="";

if(atencion){
tipo = "Atencion Medica";
}
else if(!atencion){
tipo = "Grooming";
}
return tipo;
}

animales registrar(String especie, String size, boolean atencionBool){
  animales animal = new animales(especie,size,atencionBool);
 
  if(animales.i< animales.ArrayAnimal.length){//valida que el arreglo no este lleno
  animales.ArrayAnimal[animales.i++] =  animal;//agrega el animal al arreglo

  /* int i representa la posición vacía más próxima en el arreglo para guardar un animal,
  así no sobreescribe posiciones anteriores*/

          }
  else{
  System.out.println("Nuestros cupos de hoy se han acabado.");
  }
  return animal;
}

void reporteFinal (){
    contAtencion =0;
    ContGroomin = 0;
    
    for (animales Animal : animales.ArrayAnimal) {
        if (Animal != null) { // Asegúrate de que no sea null
            if (Animal.getAtencionBool()) {
                contAtencion++;
            } else {
                ContGroomin++;
            }
        }
    }
}

void imprimirReporte(){
    System.out.println("==========Reporte===========\nCantidad de clientes en atencion medica: " + contAtencion + "\nCantidad de clientes en grooming: " + ContGroomin);
}

public void facturar(animales animal, String atencion, int precio){
System.out.println("=================Factura=============\nTipo de atencion: " + atencion + "\nEspecie: " + animal.especie + "\nSize: " + animal.size + "\nTotal: Lps." + precio );

}
}
