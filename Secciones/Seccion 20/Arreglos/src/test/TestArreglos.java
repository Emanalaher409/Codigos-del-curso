package test;

public class TestArreglos {

    public static void main(String[] args) {
        int edades[] = new int[5];
        System.out.println("edades = " + edades);

        edades[0] = 10;
        edades[1] = 11;
        edades[2] = 12;
        edades[3] = 13;
        edades[4] = 14;

        System.out.println("edades 0 = " + edades[0]);
        System.out.println("edades 0 = " + edades[1]);
        System.out.println("edades 0 = " + edades[2]);
        System.out.println("edades 0 = " + edades[3]);
        System.out.println("edades 0 = " + edades[4]);
        
        String names[]= new String [5];
        System.out.println(names);
        names[1] = "Emanuel";
        names[2] = "manolo";
        names[3] = "manuel";
        System.out.println("names =  1" + names[1]);
        System.out.println("names =  2" + names[2]);
        
            for (int i = 0; i <edades.length; i++) {
                System.out.println("edades elemento"+ i + ": "+edades[i]);
            
        }
         //solo imprimira los 3 que puse
            for (int i = 0; i <names.length; i++) {
               System.out.println("name numero"+i+": "+names[i]);
        }
    }
}
