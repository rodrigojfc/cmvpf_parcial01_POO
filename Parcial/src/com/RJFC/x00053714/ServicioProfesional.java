package com.RJFC.x00053714;

public class ServicioProfesional extends Empleado{
    private int mesesContrato;

    // Constructor
    public ServicioProfesional(String name, String puesto, double salario, int mesesContrato) {
        super(name, puesto, salario);
        this.mesesContrato = mesesContrato;
    }

    // Getter
    public int getMesesContrato() {
        return mesesContrato;
    }

    // Setter
    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    // ToString
    @Override
    public String toString() {
        return "Tipo de contrato: Servicio Profesional" +
                "\nMeses de contrato: " + mesesContrato +
                "\nNombre: " + name +
                "\nPuesto: " + puesto +
                documentos.toString() +
                "\nSalario base: $" + salario;
    }

}