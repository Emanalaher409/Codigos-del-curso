package domain;

public class Personas {
    private final int idPersona;
            private static int contadorPersonas;
            
            static{
                System.out.println("Ejecución bloque estatico");
                ++Personas.contadorPersonas;
                //idPersona= 10 no se puede inicializar
            }
            {
                System.out.println("Ejecución bloque no estatico");
                this.idPersona =  Personas.contadorPersonas++;
                        
            }
            public Personas(){
                System.out.println("Ejecucion del constrictor");
            }

    @Override
    public String toString() {
        return "Personas{" + "idPersona=" + idPersona + '}';
    }
            
}
