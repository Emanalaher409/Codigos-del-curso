
package domain;


public class Persona {
  protected String nombre;
  protected char genero;
  protected int edad;
  protected String dirección;
  
  public Persona(){
      
  }
   public Persona(String nombre){
       this.nombre= nombre;
   }

    public Persona(String nombre, char genero, int edad, String dirección) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.dirección = dirección;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direcci\u00f3n=" + dirección + '}';
    }
   
}
