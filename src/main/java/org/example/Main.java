package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("_--------------------------------------------------------------_");
        System.out.println("....########################################::::");
        System.out.println("Este prueba desde mi pc");
        /**
         * Instancia de un objeto de la clase persona
         */
        Persona persona = new Persona(); //Instancia de la clase persona (objeto persona)

        /**
         * Asignacion de valores a los atributos de la clase persona mediante los metodos setters
         */
        persona.setNombre("Mariana Gil");
        persona.setNumeroCelular(1234567890);
        persona.setEmail("asdasd@sda.com");

        System.out.println("Este es lo que Java nos muestra de una instancia de un objeto: "  + persona.toString());

        System.out.println("el nombre de la personas es: " +  persona.getNombre());

        System.out.println("el numero de la personas es: " +  persona.getNumeroCelular());

        /**
         * Instancia de un objeto de la clase profesor
         */
        Profesor profesor = new Profesor();
        profesor.setNombre("Juan");
        profesor.setNumeroCelular(1234567890);
        profesor.setEmail("teacher@julio.com");
        profesor.setSalario(1000000);

        System.out.println("Este es lo que Java nos muestra de una instancia de un objeto: "  + profesor.toString());

    }
}