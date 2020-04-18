package com.RJFC.x00053714;

import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado> planilla;

    //constructor
    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    //getter
    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getPlanilla() {
        return planilla;
    }

    //metodos
    public void addEmpleado(Empleado unEmpleado){

    }

    public void quitEmpleado(Empleado ripEmpleado){

    }

}
