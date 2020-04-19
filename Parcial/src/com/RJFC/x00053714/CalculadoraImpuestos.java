package com.RJFC.x00053714;

import javax.swing.*;

public final class CalculadoraImpuestos {
    private static double totalRenta = 0, totalISSS = 0, totalAFP = 0;

    private CalculadoraImpuestos() {

    }

    public static double calcularPago(Empleado UnEmpleado) {
        double isssDisc, taxDisc, afpDisc, liquidSalary;
        double Salario = UnEmpleado.getSalario(), SalarioImponible;

        int ConsultarOAgregar = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Solamente consultar salario liquido" +
                "\n2. Acumular los calculos de los descuentos\nSu opcion: "));

        while(ConsultarOAgregar != 1 && ConsultarOAgregar != 2){
            ConsultarOAgregar = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Solamente consultar salario liquido" +
                    "\n2. Acumular los calculos de los descuentos\nSu opcion: "));
        }

        if (UnEmpleado instanceof PlazaFija) {
            if (Salario >= 1000)
                isssDisc = 30;
            else
                isssDisc = (Salario * 0.03);
            afpDisc = (0.0625 * Salario);

            SalarioImponible = (Salario - afpDisc - isssDisc);
            if (SalarioImponible <= 472)
                return SalarioImponible;
            else if (SalarioImponible <= 895.24)
                taxDisc = 0.1 * (SalarioImponible - 472) + 17.67;
            else if (SalarioImponible <= 2038.10)
                taxDisc = 0.2 * (SalarioImponible - 895.24) + 60;
            else
                taxDisc = 0.3 * (SalarioImponible - 2038.10) + 288.57;

            if(ConsultarOAgregar == 2){
                totalAFP += afpDisc;
                totalISSS += isssDisc;
                totalRenta += taxDisc;
            }

            return liquidSalary = SalarioImponible - taxDisc;
        }

        else {
            taxDisc = (Salario * 0.10);

            if(ConsultarOAgregar == 2){
                totalRenta += taxDisc;
            }

            return liquidSalary = Salario - taxDisc;
        }
    }
        public static String mostrarTotales () {
            String totales = "Descuentos acumulados de empleados a los que se les han calculado salario liquido\nTotal ISSS: " + totalISSS + "\n"
                    + "Total Renta: " + totalRenta + "\n" +
                    "Total AFP: " + totalAFP + "\n";
            return totales;
        }
    }


