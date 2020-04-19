package com.RJFC.x00053714;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado> planilla;

    //constructor
    public Empresa(String nombre) {
        this.nombre = nombre;
        planilla = new ArrayList<>();
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
        getPlanilla();
        planilla.add(unEmpleado);
    }

    public void quitEmpleado(String ripName){

        if(planilla.isEmpty())
            JOptionPane.showMessageDialog(null,"La lista de empleados esta vacia");
        else {
            for(Iterator<Empleado> iterator = planilla.iterator(); iterator.hasNext();) {
                Empleado unEmpleado = iterator.next();
                if (unEmpleado.name.equalsIgnoreCase(ripName)) {
                    iterator.remove();
                    JOptionPane.showMessageDialog(null, "Se ha despedido al empleado");
                    return;
                }


            }
        JOptionPane.showMessageDialog(null, "No se encontro al empleado");
        }
    }

}
