
package test;

import dominio.Persona;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1= new Persona("Juan",5000.00,false);
        persona1.setNombre("Emanuel");   
        persona1.setSueldo(0.00); 
        persona1.isEliminado();
        System.out.println(persona1.ToString());
// System.out.println(persona1.getNombre());
        
       // System.out.println("El sueldo de Emanuel es "+persona1.getSueldo());
        
    }
}
