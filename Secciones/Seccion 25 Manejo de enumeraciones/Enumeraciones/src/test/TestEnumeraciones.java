/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import enumeracion.Continentes;
import enumeracion.Dias;


public class TestEnumeraciones {
    public static void main(String[] args) {
     //*   System.out.println("Dia1:"+Dias.LUNES);
       // indicarDiaSemana(Dias.LUNES);
        System.out.println("Continente 4:"+Continentes.AMERICA);
        System.out.println("paises del cuarto continente:"+ Continentes.AMERICA.getPaises());
        System.out.println("Continente 5:"+Continentes.OCEANIA);
        System.out.println("paises del quinto continente:"+ Continentes.OCEANIA.getPaises());
    }
    private static void indicarDiaSemana(Dias dias){
     switch(dias){
         case LUNES:
             System.out.println("Primer dia de la semana");
         break;
         case MARTES:
             System.out.println("SEGUNDO DIA DE LA SEMANA");
         case MIERCOLES:
             System.out.println("Tercer dia de la semana");
             break;
         case JUEVES:
             System.out.println("Cuarto dia de la semana");
         case VIERNES:
             System.out.println("Quinto dia de la semana");
         case SABADO:
             System.out.println("Es el  sexto dia de la semana");
             case DOMINGO:
             System.out.println("Es el septimo dia de la semana");
                 
     } 
     
    }
}
