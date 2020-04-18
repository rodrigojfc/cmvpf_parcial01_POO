package com.RJFC.x00053714;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //declaracion de variables
        ArrayList<Empleado> nuevosEmpleados = new ArrayList<>();
        Empresa unaEmpresa;
        byte op = 0;

        String bizName = JOptionPane.showInputDialog(null, "Ingrese nombre de la empresa");
        unaEmpresa = new Empresa(bizName);

        String menu = "1. Agregar empleado\n" +
                "2. Despedir empleado\n" +
                "3. Ver lista de empleados\n" +
                "4. Calcular sueldo\n" +
                "5. Mostrar totales\n" +
                "6. Salir\n" +
                "Su opcion: ";

            do {
                op = Byte.parseByte(JOptionPane.showInputDialog(null, menu));

                switch (op) {
                    case 1:
                        String auxName = JOptionPane.showInputDialog(null, "Ingrese nombre del empleado");
                        String eRole = JOptionPane.showInputDialog(null, "Ingrese cargo del empleado");
                        double eSalary = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado"));
                        byte eStatus = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingrese\n1- Plaza fija\n2- Servicio profesional"));
                        if (eStatus == 2) {
                            int eContract = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese meses de contrato"));
                            //nuevosEmpleados.add(new ServicioProfesional(auxName, eRole, eSalary, eContract));
                            unaEmpresa.addEmpleado(new ServicioProfesional(auxName, eRole, eSalary, eContract));
                        }
                        else{
                            int ePhonenum = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero telefonico del empleado"));
                           // nuevosEmpleados.add(new PlazaFija(auxName, eRole, eSalary, ePhonenum));
                            unaEmpresa.addEmpleado(new PlazaFija(auxName, eRole, eSalary, ePhonenum));
                        }
                        break;
                    case 2:
                        auxName = JOptionPane.showInputDialog(null, "Ingrese nombre del empleado a despedir");
                            unaEmpresa.quitEmpleado(auxName);
                        /*for(Empleado obj : nuevosEmpleados){
                            nuevosEmpleados.removeIf(n -> obj.name.equalsIgnoreCase(auxName));
                            }*/
                        break;
                    case 3:
                        for(Empleado obj : nuevosEmpleados){
                            JOptionPane.showMessageDialog(null,obj.toString());
                        }

                        break;
                    case 4:

                        break;
                    case 5:

                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Saliendo . . .");
                        break;
                }
            } while (op != 6);

        }

    }

