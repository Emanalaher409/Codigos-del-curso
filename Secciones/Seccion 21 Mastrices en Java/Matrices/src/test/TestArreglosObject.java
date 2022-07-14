
package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
       Persona personas[] = new Persona[4]; 
       
       personas[0] = new Persona("Emanuel");
       personas[1] = new Persona("Emanuel2");
       personas[2] = new Persona("Emanuel3");
       personas[3] = new Persona("Emanuel4");
       
        System.out.println("personas = " + personas[0]);
        System.out.println("personas = " + personas[1]);
        System.out.println("personas = " + personas[2]);
        System.out.println("personas = " + personas[3]);
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas = " + personas[i]+"Con for");
            
        }
       
     
      
    }
}
