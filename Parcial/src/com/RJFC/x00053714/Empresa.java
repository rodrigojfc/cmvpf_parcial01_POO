package com.RJFC.x00053714;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado> planilla = new ArrayList<>();

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
        planilla.add(unEmpleado);
    }

    public void quitEmpleado(String ripName){
        if(planilla.isEmpty())
            JOptionPane.showConfirmDialog(null,"No hay lista de empleados");
        else {
            for (Empleado obj : planilla) {
                if (ripName.equalsIgnoreCase(obj.name))
                    planilla.remove(0);
            }
            JOptionPane.showConfirmDialog(null,"Se ha despedido al empleado");
        }
    }

}
