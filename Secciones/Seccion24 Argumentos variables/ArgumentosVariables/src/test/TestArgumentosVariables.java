/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Aorus 1
 */
public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(1,4,5);
        imprimirNumeros(2,3,6);
        variosParametros("joan sebastian", 12,20,4);
    }private static void variosParametros(String nombre, int...numeros){
            System.out.println("nombre ="+ nombre);
            imprimirNumeros(numeros);
    }
    
    private static  void imprimirNumeros(int...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento"+ numeros[i]);
            
        }
        
    }
}

