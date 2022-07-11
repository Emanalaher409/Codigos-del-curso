/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Persona;

/**
 *
 * @author César
 */
public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Emanuel");
        Persona persona2 = new Persona("Pita");
        Persona persona3 = new Persona("JESUS");

        imprimir(persona1);
        imprimir(persona2);
        imprimir(persona3);
    }

    public static void imprimir(Persona persona) {
        System.out.println("Persona" + persona);
    }
}
