package org.example;

public class Persona {
    private String nombre;

    private long numeroCelular;

    private String email;

    //Setters and Getters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumeroCelular(long numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public long getNumeroCelular() {
        return numeroCelular;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", numeroCelular=" + numeroCelular +
                ", email='" + email + '\'' +
                '}';
    }

    public void comer() {
        System.out.println("Estoy comiendo");
    }

}
