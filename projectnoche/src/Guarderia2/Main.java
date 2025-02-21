package Guarderia2;

import javax.swing.*;

public class Main{

    public static void main(String[] args) {
        //solicitar datos
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID:"));
        String nombreCompleto = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad: "));
        String genero = JOptionPane.showInputDialog("Ingrese el genero: ");
        String alergias = JOptionPane.showInputDialog("Ingrese el alergias: ");
        String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre de acudiente: ");
        String numContacto= JOptionPane.showInputDialog("Ingrese el numero de contacto: ");

        Estudiante newEstudiante = new Estudiante(id,nombreCompleto, edad, genero, alergias, nombreAcudiente, numContacto);

        //Mostrar info del estudiante
        JOptionPane.showMessageDialog(null, newEstudiante);
    }
}
