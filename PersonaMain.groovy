package com.udea.proint

/**
 * Created by ubuntu on 11/10/16.
 */
class PersonaMain {

    public static void main (String[] arg){
        Persona1 p1 = new Persona1("dieg", "qui");
        System.out.println(p1);

        Persona2 p2 = new Persona2("dieg2", "qui2");
        System.out.println(p2);

        Persona3 p3 = new Persona3("dieg3", "qui3");
        System.out.println(p3);

        Persona4 p4 = new Persona4("dieg4", "qui4");
        p4.setApellido(1)
        System.out.println(p4);

        Persona5 p5 = new Persona5("dieg5", "qui5");
        p5.setApellido(1)
        System.out.println(p5);

        Persona6 p6 = new Persona6(); // def opcional
        p6.setApellido("qui6")
        p6.setNombre("dieg6")
        System.out.println(p6);

        Persona7 p7 = new Persona7()
        p7.setApellido("qui7")
        p7.setNombre("dieg7")
        System.out.println(p7);

        Persona7 p72 = new Persona7(nombre:"nombredesdeconstructor")
        System.out.println(p72);

    }
}
