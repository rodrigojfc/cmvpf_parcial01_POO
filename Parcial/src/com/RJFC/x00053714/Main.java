package com.RJFC.x00053714;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        byte op = 0;

        String menu = "1. Agregar empleado\n" +
                "2. Despedir empleado\n" +
                "3. Ver lista de empleados\n" +
                "4. Calcular sueldo\n" +
                "5. Mostrar totales\n" +
                "6. Salir\n" +
                "Su opcion: ";

        do{
            op = Byte.parseByte(JOptionPane.showInputDialog(null, menu));

            switch (op){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo . . .");
                    break;
            }
        } while(op != 6);
    }

    }

