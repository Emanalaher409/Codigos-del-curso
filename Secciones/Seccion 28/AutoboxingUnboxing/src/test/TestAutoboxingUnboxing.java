
package test;


public class TestAutoboxingUnboxing {
    //clases Envolventes de tipos primitivos
    /*
    int = Integer
    long-Long
    float -Float
    double - Double
    boolean - Boolean
    byte - Byte
    char - Char
    short - Short
    */
    public static void main(String[] args) {
       Integer entero =10;// Esto es Autoboxing
    System.out.println (
"entero = " + entero);  
        System.out.println("entero = " + entero.doubleValue());
   
    int entero2 = entero;//Esto es Unboxinx
        System.out.println("entero2 = " + entero2);
    }
    
    
    
    
    
    
    
}
