package org.example;

public class Profesor extends Persona{

    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + getNombre() + '\'' +
                ", numeroCelular=" + getNumeroCelular() +
                ", email='" + getEmail() + '\'' +
                ", salario=" + salario +
                '}';
    }
}
