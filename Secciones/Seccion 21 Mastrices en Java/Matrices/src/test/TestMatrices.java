
package test;

import domain.Persona;



public class TestMatrices {
    public static void main(String[] args) {
        int matriz[][] = new int[3][2];
        System.out.println("Matriz = " + matriz);
        
        matriz[0][0]= 4;
        matriz[0][1]= 5;
        matriz[1][0]= 6;
        System.out.println("Matriz = " + matriz[0][0]);
        
        for (int ren = 0; ren <matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("matriz = "+ren+""+col+":" + matriz[ren][col]);
                
                
            }
          
        }
        String frutas[][]  = {{"Naranja, Limon"},{"Manzana","uva"}};
        
            //Matrices con objetos
            imprimir(frutas);
            
            Persona personas[][] = new Persona[5][3];
            personas[0][0]= new Persona("Emanuel");
            personas[0][1]= new Persona("Emanue2");
            personas[0][2]= new Persona("Emanue3");
            imprimir(personas);
        }
    private static void imprimir(Object matriz[][]){
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("Matriz "+ren+"-"+col+": "+matriz[ren][col]);
            }
    }
    }
}
    
    
        

