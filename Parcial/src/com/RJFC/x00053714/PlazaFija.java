package com.RJFC.x00053714;

public class PlazaFija extends Empleado{
    private int extension;

    // Constructor
    public PlazaFija(String name, String puesto, double salario, int extension) {
        super(name, puesto, salario);
        this.extension = extension;
    }

    // Getter
    public int getExtension() {
        return extension;
    }

    // Setter
    public void setExtension(int extension) {
        this.extension = extension;
    }

    // ToString
    @Override
    public String toString() {
        return "Tipo de contrato: Plaza Fija" +
                "\nNumero de telefono de oficina: " + extension +
                "\nNombre: " + name +
                "\nPuesto: " + puesto +
                documentos.toString() +
                "\nSalario base: $" + salario;
    }

}
