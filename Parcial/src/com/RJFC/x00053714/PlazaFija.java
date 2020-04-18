package com.RJFC.x00053714;

public class PlazaFija extends Empleado{
    private int extension;

    public PlazaFija(String name, String puesto, double salario, int extension) {
        super(name, puesto, salario);
        this.extension = extension;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "PlazaFija{" +
                "name='" + name + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}
