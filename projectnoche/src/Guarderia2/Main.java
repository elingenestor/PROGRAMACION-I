package Guarderia2;

import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia();
        while (true){
            String opcion = JOptionPane.showInputDialog("seleccione una opcion: \n" +
                    "1. Registrar niño. \n" +
                    "2. Buscar niño por ID. \n" +
                    "3. Ver lista de niños. \n" +
                    "4. Ver mayores a 5 años. \n" +
                    "5. Eliminar niño. \n" +
                    "6. Salir.");
            switch (opcion){
                case "1":
                    String id = JOptionPane.showInputDialog("Ingrese el ID: ");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
                    String edad = JOptionPane.showInputDialog("Ingrese el edad: ");
                    String genero = JOptionPane.showInputDialog("Ingrese el genero: ");
                    String alergias = JOptionPane.showInputDialog("Ingrese el alergias: ");
                    String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre acudiente: ");
                    String numAcudiente = JOptionPane.showInputDialog("Ingrese el numero de contacto del acudiente: ");
                    acudiente acudiente2 = new acudiente(nombreAcudiente, numAcudiente);
                    Boy boy = new Boy(id,nombre, edad, genero, alergias, acudiente2);
                    guarderia.registrarNino(boy);
                    break;
                case "2":
                    String buscarId = JOptionPane.showInputDialog("Ingrese el ID para buscar: ");
                    Boy encontrado = guarderia.buscarNino(buscarId);
                    if (encontrado != null){
                        encontrado.mostrarInfo();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro el ID");
                    }
                    break;
                case "3":
                    guarderia.listarEstudiantes();
                    break;
                case "4":
                    guarderia.listarMayoresA5();
                    break;
                case "5":
                    String eliminarId = JOptionPane.showInputDialog("Ingrese el ID para eliminar: ");
                    guarderia.eliminarNino(eliminarId);
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    System.exit(0);
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion invalida. porfavor intentar de nuevo.");
            }
        }
    }
}

