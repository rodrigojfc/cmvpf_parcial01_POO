package com.RJFC.x00053714;

public class ServicioProfesional extends Empleado{
    private int mesesContrato;

    public ServicioProfesional(String name, String puesto, double salario, int mesesContrato) {
        super(name, puesto, salario);
        this.mesesContrato = mesesContrato;
    }

    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }
}
