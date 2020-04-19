package com.RJFC.x00053714;

public class Documento {
    private String nombre;
    private String numero;

    // Constructor
    public Documento(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    // ToString
    @Override
    public String toString() {
        return "\nTipo de documento: " + nombre +
                "\nNumero de documento: " + numero;
    }
}


