package com.RJFC.x00053714;

public final class CalculadoraImpuestos {
    private static double totalRenta = 0, totalISSS = 0, totalAFP = 0;

    private CalculadoraImpuestos(){

    }

    public static double calcularPago(Empleado UnEmpleado){
        double isssDisc, taxDisc, afpDisc, liquidSalary;
        double Salario = UnEmpleado.getSalario();

        if(UnEmpleado instanceof PlazaFija){
            if(Salario >= 1000)
                isssDisc = 30;
            else
                isssDisc = (Salario * 0.03);
            afpDisc = (0.0625 * Salario);

            Salario = (Salario - afpDisc - isssDisc);
            if(Salario <= 472)
                return Salario;
            else if(Salario <= 895.24)
                taxDisc = (0.1 * Salario) + 17.67;
            else if(Salario <= 2038.10)
                taxDisc = (0.2 * Salario) + 60;
            else
                taxDisc = (0.3 * Salario) + 288.57;
            totalAFP += afpDisc;
            totalISSS += isssDisc;
            totalRenta += taxDisc;
            return liquidSalary = Salario - taxDisc;
        }
        else {
            taxDisc = (Salario * 0.10);
            totalRenta += taxDisc;
            return liquidSalary = Salario - taxDisc;
        }
    }

    public static String mostrarTotales(){
        String totales = "Total ISSS: " + totalISSS + "\n"
                + "Total Renta: " + totalRenta + "\n" +
                "Total AFP: " + totalAFP + "\n";
        return totales;
    }

}
