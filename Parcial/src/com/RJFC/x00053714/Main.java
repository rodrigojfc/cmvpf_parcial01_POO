package com.RJFC.x00053714;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //declaracion de variables
        Empresa unaEmpresa;
        Empleado unEmpleado;
        Documento unDocumento;
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
                        String eDocName = JOptionPane.showInputDialog(null, "Ingrese tipo de documento");
                        String eDocNumber = JOptionPane.showInputDialog(null, "Ingrese el numero de documento");
                        double eSalary = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado"));
                        byte eStatus = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingrese\n1- Plaza fija\n2- Servicio profesional"));
                        while(eStatus != 1 && eStatus != 2){
                            eStatus = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingrese una opcion valida" +
                                    "\n1- Plaza fija\n2- Servicio profesional"));
                        }
                        if (eStatus == 2) {
                            int eContract = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese meses de contrato"));

                            unEmpleado = new ServicioProfesional(auxName, eRole, eSalary, eContract);
                            unDocumento = new Documento(eDocName, eDocNumber);
                            unEmpleado.addDocumento(unDocumento);
                            unaEmpresa.addEmpleado(unEmpleado);

                        }
                        else{
                            int ePhonenum = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de extension telefonica del empleado"));

                            unEmpleado = new PlazaFija(auxName, eRole, eSalary, ePhonenum);
                            unDocumento = new Documento(eDocName, eDocNumber);
                            unEmpleado.addDocumento(unDocumento);
                            unaEmpresa.addEmpleado(unEmpleado);
                        }
                        break;
                    case 2:
                        auxName = JOptionPane.showInputDialog(null, "Ingrese nombre del empleado a despedir");
                            unaEmpresa.quitEmpleado(auxName);

                        break;
                    case 3:
                        if(unaEmpresa.getPlanilla().isEmpty())
                            JOptionPane.showMessageDialog(null,"La lista de empleados esta vacia");
                        else {

                            for (Empleado obj : unaEmpresa.getPlanilla()) {
                                JOptionPane.showMessageDialog(null, obj.toString());
                            }
                        }
                        break;
                    case 4:
                        auxName = JOptionPane.showInputDialog(null, "Ingrese nombre de la persona a calcular salario");

                        boolean noExiste = true;

                        if(unaEmpresa.getPlanilla().isEmpty())
                            JOptionPane.showMessageDialog(null, "La lista de empleados esta vacia");
                        else {
                            for (Empleado obj : unaEmpresa.getPlanilla()) {
                                if (obj.name.equalsIgnoreCase(auxName)) {
                                    noExiste = false;
                                    double salario = CalculadoraImpuestos.calcularPago(obj);
                                    JOptionPane.showMessageDialog(null, "El salario es: $" + salario);
                                }
                            }
                            if(noExiste)
                                JOptionPane.showMessageDialog(null, "El empleado no esta en el sistema");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, CalculadoraImpuestos.mostrarTotales());
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Saliendo . . .");
                        break;
                }
            } while (op != 6);

        }

    }

